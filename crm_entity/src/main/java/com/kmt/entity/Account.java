package com.kmt.entity;

public class Account {
    private int accountid;
    private int uid;
    private double money;


    public Account() {
    }

    public Account(int accountid, int uid, double money) {
        this.accountid = accountid;
        this.uid = uid;
        this.money = money;
    }

    public int getAccountid() {
        return accountid;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountid=" + accountid +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }
}
