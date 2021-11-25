import React from "react";
import { makeStyles } from "@material-ui/core/styles";
import { CssBaseline } from "@material-ui/core";
import Header from "./components/Header";
import CollegeActivities from "./components/CollegeActivities";
import { BrowserRouter as Router, Route, Routes } from "react-router-dom";
import Common from "./components/Common";
import Teacher from "./components/Teacher/Teacher";
import Student from "./components/Student/Student";
const useStyles = makeStyles((theme) => ({
  root: {
    minHeight: "100vh",
    backgroundImage: `url(${
      process.env.PUBLIC_URL + "/assets/classroom-bg.jpg"
    })`,
    backgroundRepeat: "no-repeat",
    backgroundSize: "cover",
  },
}));
export default function App() {
  const classes = useStyles();
  return (
    <>
      <div className={classes.root}>
        <Router>
          <Routes>
            <Route exact path="/" element={<Common />} />
            <Route path="/acad/teacher" element={<Teacher />} />
            <Route path="/acad/student" element={<Student />} />
          </Routes>
        </Router>
      </div>
    </>
  );
}
