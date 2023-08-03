import React, { useState, useEffect } from "react";
import { findSecurities } from "../../services/SecurityHandler";
import styles from "./Security.module.css";

export const Security = () => {
    const [securities, setSecurities] = useState([]);

    useEffect(() => {
        findSecurities()
            .then(({data}) => {
            setPets(data);
            });
    }, []);
  return (
    <>
        { pets.map(pet => 
        <div className={styles.pets}>
            <div>ID: {pet.id}</div>
            <div>Name: {pet.name} </div>
            <div>Age: {pet.age}</div>
        </div>) 
        }
    </>
  )
};