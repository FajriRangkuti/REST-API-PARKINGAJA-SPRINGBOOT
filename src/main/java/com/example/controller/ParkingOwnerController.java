package com.example.controller;

import com.example.entity.ParkingOwner;
import com.example.service.ParkingOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingowner")
public class ParkingOwnerController {

    @Autowired
    ParkingOwnerService parkingOwnerService;

    @PostMapping
    public ParkingOwner registerOwner(@RequestBody ParkingOwner parkingOwner){
        return parkingOwnerService.register(parkingOwner);
    }

    @GetMapping
    public Page<ParkingOwner> findAllOwner(Pageable pageable){
        return parkingOwnerService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public ParkingOwner findById(@PathVariable String id){
        return parkingOwnerService.findById(id);
    }

    @PutMapping
    public ParkingOwner updateOwner(@RequestBody ParkingOwner parkingOwner){
        return parkingOwnerService.update(parkingOwner);
    }

}
