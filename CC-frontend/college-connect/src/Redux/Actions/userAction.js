import axios from "axios";
import { baseURL } from "../../commonurl";

export const login = (username, password, role,navigate) => {

  console.log(username, password,role);
  return async (dispatch) => {
    dispatch({
      type: "LOGIN_REQUEST",
    });

    try {
      const {data}  = await axios.post(`${baseURL}/login/`, {
        username,
        password,
        role,
      });

      console.log(data);

      if (data.status) {
        dispatch({
          type: "LOGIN_SUCCESS",
          payload: data,
        });
        navigate(`/acad/${role}`);
      }
    } catch (error) {
      console.log(JSON.stringify(error));
    }
  };
};

export const signup = (username, password, role, navigate) => {

  console.log(username, password,role);
  return async (dispatch) => {
    dispatch({
      type: "SIGNUP_REQUEST",
    });

    try {
      const {data}  = await axios.post(`${baseURL}/signup/`, {
        username,
        password,
        role,
      });

      console.log(data);

      if (data.status) {
        dispatch({
          type: "SIGNUP_SUCCESS",
          payload: data,
        });
        navigate(`/acad/${role}`);
      }
    } catch (error) {
      console.log(JSON.stringify(error));
    }
  };
};

