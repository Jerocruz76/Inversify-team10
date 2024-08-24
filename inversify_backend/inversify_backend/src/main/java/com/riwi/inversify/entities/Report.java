package com.riwi.inversify.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name="reports")
public class Report {
    public Report(){}
    public Report(String report_type, Date report_date, String content, Investor investor_id){
        this.report_type=report_type;
        this.report_date=report_date;
        this.content=content;
        this.investor_id=investor_id;
    }
    @Id
    @Column(name="id")
    private int id;
    @Column(name="report_type")
    private String report_type;
    @Column(name="report_date")
    private Date report_date;
    @Column(name="content")
    private String content;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getReport_type() {
        return report_type;
    }

    public void setReport_type(String report_type) {
        this.report_type = report_type;
    }

    public Date getReport_date() {
        return report_date;
    }

    public void setReport_date(Date report_date) {
        this.report_date = report_date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }
}
