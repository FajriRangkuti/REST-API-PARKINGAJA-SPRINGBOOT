package com.example.controller;

import com.example.entity.ParkingTransactionHistory;
import com.example.service.ParkingTransactioHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/history")
public class ParkingTransactionHistoryController {

    @Autowired
    ParkingTransactioHistoryService parkingTransactioHistoryService;

    @PostMapping
    public ParkingTransactionHistory registerHistory(@RequestBody ParkingTransactionHistory parkingTransactionHistory){
        return parkingTransactioHistoryService.register(parkingTransactionHistory);
    }

    @GetMapping
    public Page<ParkingTransactionHistory> findAllHistory(Pageable pageable){
        return parkingTransactioHistoryService.findAll(pageable);
    }

}
