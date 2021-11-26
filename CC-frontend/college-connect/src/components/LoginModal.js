import React, { useState } from "react";

import {
  Button,
  DialogContent,
  Dialog,
  DialogActions,
  DialogContentText,
  DialogTitle,
  TextField,
  Tabs,
  Tab,
  Box,
  Typography,
  Radio,
  RadioGroup,
  FormControl,
  FormControlLabel,
  FormLabel,
} from "@material-ui/core";
import PropTypes from "prop-types";

import { useDispatch, useSelector } from "react-redux";
import { login,signup } from "../Redux/Actions/userAction";
import { useNavigate } from "react-router-dom";

function TabPanel(props) {
  const { children, value, index, ...other } = props;

  return (
    <div
      role="tabpanel"
      hidden={value !== index}
      id={`simple-tabpanel-${index}`}
      aria-labelledby={`simple-tab-${index}`}
      {...other}
    >
      {value === index && (
        <Box sx={{ p: 3 }}>
          <Typography>{children}</Typography>
        </Box>
      )}
    </div>
  );
}

TabPanel.propTypes = {
  children: PropTypes.node,
  index: PropTypes.number.isRequired,
  value: PropTypes.number.isRequired,
};

function a11yProps(index) {
  return {
    id: `simple-tab-${index}`,
    "aria-controls": `simple-tabpanel-${index}`,
  };
}

function LoginModal({ isOpen }) {
  const [value, setValue] = useState(0);
  const [userName, setUserName] = useState("");
  const [password, setPassword] = useState("");
  const [role, setRole] = useState("student");
  const navigate = useNavigate();

  const dispatch = useDispatch();

  const handleChange = (event, newValue) => {
    setValue(newValue);
  };

  const handleLogin = (username, password, role,navigate) => {
    dispatch(login(username, password, role,navigate));
  };


  const handleSignUp = (username, password, role, navigate) => {
    dispatch(signup(username, password, role, navigate));
  };
  console.log(userName, password, role);
  return (
    <React.Fragment>
      <Dialog
        open={isOpen}
        disableEscapeKeyDown
        onDismiss={(isOpen) => !isOpen}
      >
        <DialogTitle>Welcome to the college connect network</DialogTitle>
        <DialogContent>
          <Box sx={{ width: "100%" }}>
            <Box sx={{ borderBottom: 1, borderColor: "divider" }}>
              <Tabs
                value={value}
                onChange={handleChange}
                aria-label="basic tabs example"
              >
                <Tab label="Login" {...a11yProps(0)} />
                <Tab label="Sign Up" {...a11yProps(1)} />
              </Tabs>
            </Box>
            <TabPanel value={value} index={0}>
              <TextField
                label="Username"
                variant="outlined"
                value={userName}
                style={{ marginTop: 10 }}
                onChange={(e) => setUserName(e.target.value)}
              />
              <br />
              <TextField
                label="Password"
                variant="outlined"
                style={{ marginTop: 10 }}
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
              <br />
              <FormControl component="fieldset" style={{ marginTop: 15 }}>
                <FormLabel component="legend">Role</FormLabel>
                <RadioGroup
                  row
                  aria-label="gender"
                  name="row-radio-buttons-group"
                  onChange={(e) => setRole(e.target.value)}
                  value={role}
                >
                  <FormControlLabel
                    value="student"
                    control={<Radio />}
                    label="Student"
                  />
                  <FormControlLabel
                    value="teacher"
                    control={<Radio />}
                    label="Teacher"
                  />
                </RadioGroup>
              </FormControl>
              <br />
              <Button
                variant="contained"
                color="primary"
                onClick={() => handleLogin(userName, password, role,navigate)}
              >
                Login
              </Button>
            </TabPanel>
            <TabPanel value={value} index={1}>
            <TextField
                label="Username"
                variant="outlined"
                value={userName}
                style={{ marginTop: 10 }}
                onChange={(e) => setUserName(e.target.value)}
              />
              <br />
              <TextField
                label="Password"
                variant="outlined"
                style={{ marginTop: 10 }}
                value={password}
                onChange={(e) => setPassword(e.target.value)}
              />
              <br />

              <FormControl component="fieldset" style={{ marginTop: 15 }}>
                <FormLabel component="legend">Role</FormLabel>
                <RadioGroup
                  row
                  aria-label="gender"
                  name="row-radio-buttons-group"
                  onChange={(e) => setRole(e.target.value)}
                  value={role}
                >
                  <FormControlLabel
                    value="student"
                    control={<Radio />}
                    label="Student"
                  />
                  <FormControlLabel
                    value="teacher"
                    control={<Radio />}
                    label="Teacher"
                  />
                </RadioGroup>
              </FormControl>
              <br />

              <Button
                variant="contained"
                color="secondary"
                onClick={() => handleSignUp(userName, password, role, navigate)}
              >
                Create Now{" "}
              </Button>
            </TabPanel>
          </Box>
        </DialogContent>
      </Dialog>
    </React.Fragment>
  );
}

export default LoginModal;
