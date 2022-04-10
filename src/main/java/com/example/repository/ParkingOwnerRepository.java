package com.example.repository;

import com.example.entity.ParkingOwner;
import com.example.entity.ParkingTransaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingOwnerRepository extends JpaRepository<ParkingOwner,String> {

}
