package com.bill.staybill.model;

import java.util.List;
public class BillRequest {

    public List<Person> getPeople() {
        return people;
    }

    public void setPeople(List<Person> people) {
        this.people = people;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(double totalBill) {
        this.totalBill = totalBill;
    }

    private double totalBill;
    private List<Person> people;


}
