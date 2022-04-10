package com.example.controller;


import com.example.entity.ParkingTransaction;
import com.example.service.ParkingTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingVehicle")
public class ParkingTransactionController {

    @Autowired
    ParkingTransactionService parkingTransactionService;

    @PostMapping("/checkin")
    public ParkingTransaction CheckIn(@RequestBody ParkingTransaction parkingTransaction){
        return parkingTransactionService.register(parkingTransaction);
    }

    //Nott
    @PostMapping("/checkout")
    public ParkingTransaction checkOut(@RequestBody ParkingTransaction parkingTransaction){
        return parkingTransactionService.registerCheckOut(parkingTransaction);
    }

    @GetMapping
    public Page<ParkingTransaction> findAllTransaction(Pageable pageable){
        return parkingTransactionService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ParkingTransaction findTransactionById(@PathVariable String id){
        return parkingTransactionService.findById(id);
    }
}
