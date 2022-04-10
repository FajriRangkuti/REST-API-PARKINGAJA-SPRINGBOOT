package com.example.controller;

import com.example.entity.ParkingArea;
import com.example.service.ParkingAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("parking")
public class ParkingAreaController {

    @Autowired
    ParkingAreaService parkingAreaService;

    @PostMapping
    public ParkingArea registerArea(@RequestBody ParkingArea parkingArea){
        return parkingAreaService.register(parkingArea);
    }

    @GetMapping
    public Page<ParkingArea> findAllAreaParking(Pageable pageable){
        return parkingAreaService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ParkingArea findParkingById(@PathVariable String id){
        return parkingAreaService.findById(id);
    }
}
