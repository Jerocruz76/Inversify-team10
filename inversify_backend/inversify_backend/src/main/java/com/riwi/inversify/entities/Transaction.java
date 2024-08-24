package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="transactions")
public class Transaction {
    public Transaction(){}
    public Transaction(Date date, float amount, String transaction_type, Investor investor_id, Value value_id){
        this.date=date;
        this.amount=amount;
        this.transaction_type=transaction_type;
        this.investor_id=investor_id;
        this.value_id=value_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="date")
    private Date date;
    @Column(name="amount")
    private float amount;
    @Column(name="transaction_type")
    private String transaction_type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="value_id")
    private Value value_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public String getTransaction_type() {
        return transaction_type;
    }

    public void setTransaction_type(String transaction_type) {
        this.transaction_type = transaction_type;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }

    public Value getValue_id() {
        return value_id;
    }

    public void setValue_id(Value value_id) {
        this.value_id = value_id;
    }
}
