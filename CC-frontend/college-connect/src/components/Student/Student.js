import React from "react";

import { useSelector } from 'react-redux';

import { Backdrop } from "@material-ui/core";



function Student() {

  const data = useSelector(state => state.userLoginReducer);

  const { loading,profileObj } = data;

  console.log(loading, profileObj);

  return (
    <>


      {loading ? <Backdrop open={loading} /> : <div>Student component</div>}

    </>

  )

}

export default Student;
