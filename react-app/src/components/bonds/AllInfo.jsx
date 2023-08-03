import React from 'react'
import Security from './Security'

const AllInfo = () => {
    
    const securities = {
        "isin": "XS210819",
        "bond_currency": "USD", 
        "cusip": "BDCH30£379", 
        "face_value_mn": 100, 
        "issuer_name": "Amazon", 
        "bond_maturity_date": "05/08/2021", 
        "s_status": "active", 
        "s_type": "CORP", 
        "coupon_percent": 4.37

        /* 
        ('XS1988387210', 'USD', NULL, 1000, 'BNPParibasIssu 4,37% Microsoft Corp (USD)', '2021-08-05', 'active', 'CORP', 4.37),
        ('USN0280EAR64', 'USD', '123456780', 900, 'Airbus 3.15%  USD', '2021-07-30', 'active', 'CORP', 3.15),
        ('A12356111', 'USD', '123456bh0', 900, 'UBS Facebook (USD)', '2021-09-30', 'active', 'CORP', 2),
        ('USU02320AG12', 'USD', 'AMZN 3.15 08/22/27 REGS', 900, 'Amazon', '2021-08-03', 'active', 'CORP', 3.15),
        ('GB00B6460505', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460506', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460507', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460508', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460509', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460510', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460511', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460512', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460513', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460514', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('GB00B6460515', 'GBP', 'BDCHBW8', 900, 'HM Treasury United Kingdon', '2021-08-09', 'active', 'GOVN', 0.75),
        ('US87973RAA86', 'USD', '87973RAA8', 690, 'TEMASEK FINL I LTD GLOBAL MEDIUM TERM NTS BOOK ENTRY REG S', '2021-08-06', 'active', 'SOVN',2.02),
        ('IE00B29LNP31', 'USD', '87973RAA8', 340, 'First Norway Alpha Kl.IV', '2030-12-22', 'active', 'SOVN', 1.123);
        */
    }

    return (
        <div>Security</div>
        <Security info={secur}/>
    )

}

export default AllInfo