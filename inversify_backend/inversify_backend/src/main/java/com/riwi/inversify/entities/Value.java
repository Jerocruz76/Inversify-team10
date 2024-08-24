package com.riwi.inversify.entities;

import com.riwi.inversify.enums.ValueType;
import jakarta.persistence.*;

@Entity
@Table(name="values")
public class Value {
    public Value(){}
    public Value(String name, ValueType value_type, float actual_price, Portfolio portfolio_id){
        this.name=name;
        this.value_type=value_type;
        this.actual_price=actual_price;
        this.portfolio_id=portfolio_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="value_type")
    private ValueType value_type;
    @Column(name="actual_price")
    private float actual_price;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="portfolio_id")
    private Portfolio portfolio_id;

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

    public ValueType getValue_type() {
        return value_type;
    }

    public void setValue_type(ValueType value_type) {
        this.value_type = value_type;
    }

    public float getActual_price() {
        return actual_price;
    }

    public void setActual_price(float actual_price) {
        this.actual_price = actual_price;
    }

    public Portfolio getPortfolio_id() {
        return portfolio_id;
    }

    public void setPortfolio_id(Portfolio portfolio_id) {
        this.portfolio_id = portfolio_id;
    }
}
