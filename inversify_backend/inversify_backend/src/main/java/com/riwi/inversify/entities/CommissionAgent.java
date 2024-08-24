package com.riwi.inversify.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="commission_agent")
public class CommissionAgent {
    public CommissionAgent(){}
    public CommissionAgent(String name, String contact, String commissions, String extra_data){
        this.name=name;
        this.contact=contact;
        this.commissions=commissions;
        this.extra_data=extra_data;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="contact")
    private String contact;
    @Column(name="commissions")
    private String commissions;
    @Column(name="extra_data")
    private String extra_data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getCommissions() {
        return commissions;
    }

    public void setCommissions(String commissions) {
        this.commissions = commissions;
    }

    public String getExtra_data() {
        return extra_data;
    }

    public void setExtra_data(String extra_data) {
        this.extra_data = extra_data;
    }
}
