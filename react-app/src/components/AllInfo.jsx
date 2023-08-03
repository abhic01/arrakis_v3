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
              <div>Book ID: {bond.book_id}</div>
              <div>Security ID: {bond.security_id}</div>
              <div>Counterparty ID: {bond.counterparty_id}</div>
              <div>Quantity: {bond.quantity}</div>
              <div>Unit Price: {bond.unit_price}</div>
              <div>Buy / Sell: {bond.buy_sell}</div>
              <div>Trade Date: {bond.trade_date}</div>
              <div>Settlement Date: {bond.settlement_date}</div>

          </div>) 
          }
      </>
    )
  };