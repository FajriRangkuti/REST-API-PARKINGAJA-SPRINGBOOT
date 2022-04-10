package com.example.service;

import com.example.entity.ParkingTransaction;
import com.example.entity.Vehicle;
import com.example.repository.VehicleRepository;
import com.example.responmessage.ResponMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class VehicleService implements CRUDservice<Vehicle,String> {

    @Autowired
    VehicleRepository vehicleRepository;

    @Override
    public Vehicle register(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Page<Vehicle> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public Vehicle findById(String s) {
        existenceValidation(s);
        return vehicleRepository.findById(s).get();
    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public List<Vehicle> delete(String s) {
        return null;
    }

    private void existenceValidation(String id) {
        if(!vehicleRepository.existsById(id)){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,
                    ResponMessage.getResourceNotFound(ParkingTransaction.class.getSimpleName(), id));
        }
    }
}
