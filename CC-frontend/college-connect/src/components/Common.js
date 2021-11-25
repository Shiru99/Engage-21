import React from "react";
import { CssBaseline } from "@material-ui/core";
import Header from "./Header";
import CollegeActivities from "./CollegeActivities";

function Common() {
  return (
    <>
      <CssBaseline />
      <Header />
      <CollegeActivities />
    </>
  );
}

export default Common;
