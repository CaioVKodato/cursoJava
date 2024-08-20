package Excecoes.ExFixacao.models.entities;

import Excecoes.ExceptionPersonality.models.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;


    public Account() {
    }


    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }


    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return this.balance;
    }

    public Double getWithdrawLimit() {
        return this.withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        verifyWithdraw(amount);
        balance -= amount;
    }

    public void verifyWithdraw(double amount) {
        if (amount > getBalance()) {
            throw new DomainException("Not enough balance");
        }
        if (amount > getWithdrawLimit()) {
            throw new DomainException("The amount exceeds withdraw limit");
        }
    }

}
