package com.riwi.inversify.entities;

import jakarta.persistence.*;

@Entity
@Table(name="portfolios")
public class Portfolio {
    public Portfolio(){}
    public Portfolio(String name, String description, Investor investor_id){
        this.name=name;
        this.description=description;
        this.investor_id=investor_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
