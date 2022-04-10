package com.example.service;

import com.example.entity.ParkingTransactionHistory;
import com.example.repository.ParkingTransactionHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingTransactioHistoryService implements CRUDservice<ParkingTransactionHistory, String> {

    @Autowired
    ParkingTransactionHistoryRepository parkingTransactionHistoryRepository;

    @Override
    public ParkingTransactionHistory register(ParkingTransactionHistory parkingTransactionHistory) {
        return parkingTransactionHistoryRepository.save(parkingTransactionHistory);
    }

    @Override
    public Page<ParkingTransactionHistory> findAll(Pageable pageable) {
        return parkingTransactionHistoryRepository.findAll(pageable);
    }

    @Override
    public ParkingTransactionHistory findById(String s) {
        return null;
    }

    @Override
    public ParkingTransactionHistory update(ParkingTransactionHistory parkingTransactionHistory) {
        return null;
    }

    @Override
    public List<ParkingTransactionHistory> delete(String s) {
        return null;
    }
}
