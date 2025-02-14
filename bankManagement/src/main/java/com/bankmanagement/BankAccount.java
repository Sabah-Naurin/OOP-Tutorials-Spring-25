package com.bankmanagement;

public class BankAccount {
    private String id;
    private double balance;

    public BankAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String idValue) {
        this.id = idValue;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
            return true;
        } else return false;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            setBalance(getBalance() - amount);
            return true;
        } else return false;
    }
}
