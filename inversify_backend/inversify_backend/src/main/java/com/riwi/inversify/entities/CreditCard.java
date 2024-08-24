package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="credit_card")
public class CreditCard {
    public CreditCard(){}
    public CreditCard(int card_number, Date expiration_date, float credit_limit, float taxrate, Investor investor_id){
        this.card_number=card_number;
        this.expiration_date=expiration_date;
        this.credit_limit=credit_limit;
        this.taxrate=taxrate;
        this.investor_id=investor_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="card_number")
    private int card_number;
    @Column(name="expiration_date")
    private Date expiration_date;
    @Column(name="credit_limit")
    private float credit_limit;
    @Column(name="taxrate")
    private float taxrate;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="Investor_id")
    private Investor investor_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public float getCredit_limit() {
        return credit_limit;
    }

    public void setCredit_limit(float credit_limit) {
        this.credit_limit = credit_limit;
    }

    public float getTaxrate() {
        return taxrate;
    }

    public void setTaxrate(float taxrate) {
        this.taxrate = taxrate;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }
}
