package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Customers {
    ArrayList<Object> contList = new ArrayList<>();
    HashMap<String, List> accounts = new HashMap<>();
    String name;
    double accountNum = Math.random();
    double Balance = Math.random();

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAccountNum(double accountNum) {
        this.accountNum = accountNum;
    }
    public double getAccountNum() {
        return accountNum;
    }

    public void setBalance(double balance) { this.Balance = balance;    }
    public double getBalance() { return Balance;    }










}
