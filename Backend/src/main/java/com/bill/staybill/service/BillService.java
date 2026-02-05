package com.bill.staybill.service;


import com.bill.staybill.model.BillRequest;
import com.bill.staybill.model.BillResponse;
import com.bill.staybill.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BillService {

    public List<BillResponse> splitBill(BillRequest request) {
        if (request.getTotalBill() <= 0) {
            throw new IllegalArgumentException("Total bill must be greater than zero");
        }

        if (request.getPeople() == null || request.getPeople().isEmpty()) {
            throw new IllegalArgumentException("People list cannot be empty");
        }
        double totalBill = request.getTotalBill();
        List<Person> people = request.getPeople();

        int totalDays = 0;
        for (Person person : people) {

            if (person.getDaysStayed() <= 0) {
                throw new IllegalArgumentException(
                        "Days stayed must be positive for " + person.getName()
                );
            }

            totalDays += person.getDaysStayed();
        }


        double costPerDay = totalBill / totalDays;

        List<BillResponse> result = new ArrayList<>();

        for(Person person : people){

            double amount = Math.round(person.getDaysStayed() * costPerDay * 100.0) / 100.0;

            result.add(new BillResponse(person.getName(), amount));
        }
        return result;
    }
}
