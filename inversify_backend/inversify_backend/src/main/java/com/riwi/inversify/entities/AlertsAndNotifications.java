package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="alerts_n_notifications")
public class AlertsAndNotifications {
    public AlertsAndNotifications(){}
    public AlertsAndNotifications(String message, Date date, String alert_type, Investor investor_id){
        this.message=message;
        this.date=date;
        this.alert_type=alert_type;
        this.investor_id=investor_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="message")
    private String message;
    @Column(name="date")
    private Date date;
    @Column(name="alert_type")
    private String alert_type;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getAlert_type() {
        return alert_type;
    }

    public void setAlert_type(String alert_type) {
        this.alert_type = alert_type;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }
}
