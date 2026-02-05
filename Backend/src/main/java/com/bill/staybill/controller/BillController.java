package com.bill.staybill.controller;

import com.bill.staybill.model.BillRequest;
import com.bill.staybill.model.BillResponse;
import com.bill.staybill.service.BillService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class BillController {

    private final BillService billService;

    public BillController(BillService billService) {
        this.billService = billService;
    }

    @PostMapping("/split")
    public List<BillResponse> splitBill(@RequestBody BillRequest request) {
        return billService.splitBill(request);
    }
}
