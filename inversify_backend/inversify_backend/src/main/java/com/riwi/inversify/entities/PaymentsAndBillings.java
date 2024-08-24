package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="payments_n_billings")
public class PaymentsAndBillings {
    public PaymentsAndBillings(){}
    public PaymentsAndBillings(float amount, Date date, String payment_type, Investor investor_id, CreditCard card_id, BankAccount account_id){
        this.amount=amount;
        this.date=date;
        this.payment_type=payment_type;
        this.investor_id=investor_id;
        this.card_id=card_id;
        this.account_id=account_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="amount")
    private float amount;
    @Column(name="date")
    private Date date;
    @Column(name="payment_type")
    private String payment_type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="card_id")
    private CreditCard card_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="account_id")
    private BankAccount account_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPayment_type() {
        return payment_type;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }

    public CreditCard getCard_id() {
        return card_id;
    }

    public void setCard_id(CreditCard card_id) {
        this.card_id = card_id;
    }

    public BankAccount getAccount_id() {
        return account_id;
    }

    public void setAccount_id(BankAccount account_id) {
        this.account_id = account_id;
    }
}
