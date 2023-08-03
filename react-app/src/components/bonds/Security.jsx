import React from 'react'

const Security = (props) => {
    return (
        <div>
            <p id="blue-isin">Isin: {props.info.isin}</p>
            <p className="green-class">Bond Currency: {props.info.bond_currency}</p>
        </div>
    )
}

export default Security