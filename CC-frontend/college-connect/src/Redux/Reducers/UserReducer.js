const initialState = {
  profileObj: {},
  status: "",
  loading: false,
};

export const userLoginReducer = (state = initialState, action) => {
  switch (action.type) {
    case "LOGIN_REQUEST":
      return { ...state, loading: true };

    case "LOGIN_SUCCESS":
      return {
        ...state,
        loading: false,
        profileObj: action.payload,
      };

    case "SIGNUP_REQUEST":
      return {
        ...state,
        loading: true,
      };

    case "SIGNUP_SUCCESS":
      return {
        ...state,
        loading: false,
        profileObj: action.payload,
      };

    default:
      return state;
  }
};
