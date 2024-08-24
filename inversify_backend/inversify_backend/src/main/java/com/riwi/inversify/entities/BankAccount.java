package com.riwi.inversify.entities;

import com.riwi.inversify.enums.AccountType;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

@Entity
@Table(name="bank_accounts")
public class BankAccount {
    public BankAccount(){}
    public BankAccount(int account_number, String bank, AccountType account_type, float balance, Investor investor_id){
        this.account_number=account_number;
        this.bank=bank;
        this.account_type=account_type;
        this.balance=balance;
        this.investor_id=investor_id;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;
    @Column(name="account_number")
    private int account_number;
    @Column(name="bank")
    private String bank;
    @Column(name="account_type")
    private AccountType account_type;
    @Column(name="balance")
    private float balance;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="investor_id")
    private Investor investor_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAccount_number() {
        return account_number;
    }

    public void setAccount_number(int account_number) {
        this.account_number = account_number;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public AccountType getAccount_type() {
        return account_type;
    }

    public void setAccount_type(AccountType account_type) {
        this.account_type = account_type;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Investor getInvestor_id() {
        return investor_id;
    }

    public void setInvestor_id(Investor investor_id) {
        this.investor_id = investor_id;
    }
}
