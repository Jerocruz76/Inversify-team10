package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="activity_history")
public class ActivityHistory {
    public ActivityHistory(){}
    public ActivityHistory(Date date, String description, Investor investor_id){
        this.date = date;
        this.description=description;
        this.investor_id=investor_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="date")
    private Date date;
    @Column(name="description")
    private String description;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }
}
