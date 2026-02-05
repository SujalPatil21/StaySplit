package com.bill.staybill.model;

public class BillResponse {

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
    private double amount;

    public BillResponse(String name , double amount){

        this.name = name;
        this.amount = amount;

    }
}
