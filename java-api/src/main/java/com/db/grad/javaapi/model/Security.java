package com.db.grad.javaapi.model;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "security")
public class Security {
    @Id
    private int id;
    private String isin;
    private String cusip;
    private String issuer_name;
    private Date maturity_Date;
    private float coupon;
    private String type;
    private float face_value;
    private String currency;
    private String status;

    /*
     * Getters and setters
     */

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "isin", nullable = false)
    public String getIsin() {
        return isin;
    }
    public void setIsin(String isin) {
        this.isin = isin;
    }

    @Column(name = "cusip", nullable = true)
    public String getCusip() {
        return cusip;
    }
    public void setCusip(String cusip) {
        this.cusip = cusip;
    }

    @Column(name = "issuer_name", nullable = false)
    public String getIssuer_name() {
        return issuer_name;
    }
    public void setIssuer_name(String issuer_name) {
        this.issuer_name = issuer_name;
    }

    @Column(name = "maturity_date", nullable = false)
    public Date getMaturity_Date() {
        return maturity_Date;
    }
    public void setMaturity_Date(Date maturity_Date) {
        this.maturity_Date = maturity_Date;
    }

    @Column(name = "coupon", nullable = false)
    public float getCoupon() {
        return coupon;
    }
    public void setCoupon(float coupon) {
        this.coupon = coupon;
    }

    @Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    @Column(name = "face_value", nullable = false)
    public float getFace_value() {
        return face_value;
    }
    public void setFace_value(float face_value) {
        this.face_value = face_value;
    }

    @Column(name = "dog_id", nullable = false)
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }


}