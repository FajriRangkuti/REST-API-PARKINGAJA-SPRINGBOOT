package com.example.service;

import com.example.entity.ParkingOwner;
import com.example.repository.ParkingOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class ParkingOwnerService implements CRUDservice<ParkingOwner, String> {

    @Autowired
    ParkingOwnerRepository parkingOwnerRepository;

    @Override
    public ParkingOwner register(ParkingOwner parkingOwner) {
        return parkingOwnerRepository.save(parkingOwner);
    }

    @Override
    public Page<ParkingOwner> findAll(Pageable pageable) {
        //Pageable pageData = PageRequest.of(page,size);
        return parkingOwnerRepository.findAll(pageable);
    }

    @Override
    public ParkingOwner findById(String s) {
        return parkingOwnerRepository.findById(s).get();
    }

    @Override
    public ParkingOwner update(ParkingOwner parkingOwner) {
        return parkingOwnerRepository.save(parkingOwner);
    }

    @Override
    public List<ParkingOwner> delete(String s) {
        return null;
    }
}
