import React, { useState, useEffect } from "react";
import { findBonds } from "../../services/AllInfoServices";
import styles from "./bonds.module.css";


export const AllInfo = () => {
    const [bonds, setBonds] = useState([]);
    
    useEffect(() => {
        findBonds()
              .then(({data}) => {
              setBonds(data);
              });
      }, []);
    return (
      <>
          { bonds.map(bond => 
          <div className={styles.bonds}>
              <div>ID: {bond.id}</div>
              <div>ISIN: {bond.isin} </div>
              <div>CUSIP: {bond.cusip}</div>
              <div>Issuer Name: {bond.issuer_name}</div>
              <div>Maturity Date: {bond.maturity_date}</div>
              <div>Coupon: {bond.coupon}</div>
              <div>Type: {bond.type}</div>
              <div>Face Value: {bond.face_value}</div>
              <div>Currency: {bond.currency}</div>
              <div>Status: {bond.status}</div>
          </div>) 
          }
      </>
    )
    
  };


//import Security from './bonds/Security'
//export default AllInfo

/*
`id` int NOT NULL AUTO_INCREMENT,
`isin` varchar(50) DEFAULT NULL,
`cusip` varchar(50) DEFAULT NULL,
`issuer_name` varchar(255) NOT NULL,
`maturity_date` datetime NOT NULL,
`coupon` float NOT NULL,
`type` varchar(255) NOT NULL,
`face_value` float NOT NULL,
`currency` varchar(10) NOT NULL,
`status` varchar(32) DEFAULT NULL,
PRIMARY KEY (`id`)
*/