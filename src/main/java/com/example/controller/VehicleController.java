package com.example.controller;

import com.example.entity.Vehicle;
import com.example.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

    @Autowired
    VehicleService vehicleService;

    @PostMapping
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle){
        return vehicleService.register(vehicle);
    }

    @GetMapping("/{id}")
    public Vehicle findById(@PathVariable String id){
        return vehicleService.findById(id);
    }
}
