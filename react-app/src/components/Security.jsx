import React, { useState, useEffect } from "react";
import { findBonds } from "../../services/AllInfoServices";
import styles from "./bonds.module.css";

export const Security = () => {
    const [securities, setSecurities] = useState([]);

    useEffect(() => {
        findSecurities()
            .then(({data}) => {
            setSecurities(data);
            });
    }, []);
  return (
    <>
        { bonds.map(pet => 
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