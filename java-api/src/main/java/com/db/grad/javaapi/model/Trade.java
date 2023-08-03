//  makes counter_party sql table columns into objects 
//  quantity;currency, status, unit_price, trade_date, 
//  settlement_date, buy_sell, id, book_id, security_id, counterparty_id

package com.db.grad.javaapi.model;

import java.time.LocalDateTime;
import java.util.Currency;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="Trade")
public class Trade{

    @Id

    // creates variables
    private int quantity;
    private Currency currency;
    private String status;
    private double unit_price;
    private LocalDateTime trade_date;
    private String settlement_date;
    private String buy_sell;
    private int id;
    private int book_id;
    private int security_id;
    private int counterparty_id;


    // creates objects for each of the table columns
    @Id
    @Column(name = "quantity", nullable=false )
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
     
    
    @Column(name="currency", nullable =false )
    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    @Column(name= "status", nullable=false )
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    @Column(name="unit_price", nullable=false )
    public double getUnitPrice() {
        return unit_price;
    }

    public void setUnitPrice(double unitPrice) {
        this.unit_price = unitPrice;
    }
    

    @Column(name="trade_date", nullable=false )
    public LocalDateTime getTradeDate() {
        return trade_date;
    }

    public void setTradeDate(LocalDateTime tradeDate) {
        this.trade_date = tradeDate;
    }


    @Column(name="settlement_date", nullable=false )
    public String getSettlementDate() {
        return settlement_date;
    }

    public void setSettlementDate(String settlement_date) {
        this.settlement_date = settlement_date;
    }

    
    @Column(name="buy_sell", nullable=false )
    public String getBuySell() {
        return buy_sell;
    }

    public void setBuySell(String buy_sell) {
        this.buy_sell = buy_sell;
    }
    

    @Column(name = "id", nullable=false )
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    @Column(name = "book_id", nullable=false )
    public int getBookId() {
        return book_id;
    }

    public void setBookId(int book_id) {
        this.book_id = book_id;
    }


    @Column(name = "security_id", nullable=false )
    public int getSecurityId() {
        return security_id;
    }

    public void setSecurityId(int security_id) {
        this.security_id = security_id;
    }


    @Column(name = "counterparty_id", nullable=false )
    public int getCounterpartyId() {
        return counterparty_id;
    }

    public void setCounterpartyId(int counterparty_id) {
        this.counterparty_id = counterparty_id;
    }
    
    
}