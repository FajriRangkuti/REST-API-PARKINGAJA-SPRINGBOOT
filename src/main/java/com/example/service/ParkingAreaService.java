package com.example.service;

import com.example.entity.ParkingArea;
import com.example.entity.ParkingTransaction;
import com.example.repository.ParkingAreaRepository;
import com.example.responmessage.ResponMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ParkingAreaService implements CRUDservice<ParkingArea,String> {

    @Autowired
    ParkingAreaRepository parkingAreaRepository;

    @Override
    public ParkingArea register(ParkingArea parkingArea) {
        return parkingAreaRepository.save(parkingArea);
    }

    @Override
    public Page<ParkingArea> findAll(Pageable pageable) {
        return parkingAreaRepository.findAll(pageable);
    }

    @Override
    public ParkingArea findById(String s) {
        existenceValidation(s);
        return parkingAreaRepository.findById(s).get();
    }

    @Override
    public ParkingArea update(ParkingArea parkingArea) {
        return parkingAreaRepository.save(parkingArea);
    }

    @Override
    public List<ParkingArea> delete(String s) {
        return null;
    }

    private void existenceValidation(String id) {
        if(!parkingAreaRepository.existsById(id)){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,
                    ResponMessage.getResourceNotFound(ParkingTransaction.class.getSimpleName(), id));
        }
    }
}
