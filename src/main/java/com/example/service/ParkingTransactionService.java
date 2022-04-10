package com.example.service;

import com.example.calculation.ParkingCalculation;
import com.example.entity.ParkingArea;
import com.example.entity.ParkingTransaction;
import com.example.entity.ParkingTransactionHistory;
import com.example.entity.Vehicle;
import com.example.repository.ParkingTransactionRepository;
import com.example.responmessage.ResponMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.convert.PeriodFormat;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.sql.Timestamp;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class ParkingTransactionService implements CRUDservice<ParkingTransaction,String>{

    @Autowired
    ParkingTransactionRepository parkingTransactionRepository;

    @Autowired
    ParkingAreaService parkingAreaService;

    @Autowired
    ParkingTransactioHistoryService parkingTransactioHistoryService;

    @Autowired
    VehicleService vehicleService;

    @Transactional
    @Override
    public ParkingTransaction register(ParkingTransaction parkingTransaction) {

       //parkingTransaction.setCheckIn(LocalTime.now(ZoneId.of("GMT+7")));

       ParkingArea parkingArea = parkingAreaService.findById(parkingTransaction.getParkingArea().getId());
       Vehicle vehicle = vehicleService.findById(parkingTransaction.getVehicle().getId());

        if (parkingArea.getParkingCapacity()< vehicle.getWeight()){
            throw new ResponseStatusException(HttpStatus.FORBIDDEN,
                   ResponMessage.getResourceParkingFull(ParkingTransaction.class.getSimpleName(), parkingTransaction.getVehicle().getName()));
        }

        vehicleService.findById(parkingTransaction.getVehicle().getId());

        parkingArea.setParkingCapacity(parkingArea.getParkingCapacity() - vehicle.getWeight());
        parkingAreaService.update(parkingArea);
        return parkingTransactionRepository.save(parkingTransaction);

    }

    public ParkingTransaction registerCheckOut(ParkingTransaction parkingTransaction) {

        ParkingCalculation parkingCalculation = new ParkingCalculation();
        ParkingArea area = parkingAreaService.findById(parkingTransaction.getParkingArea().getId());
        Vehicle vehicle = vehicleService.findById(parkingTransaction.getVehicle().getId());

        existenceValidation(parkingTransaction.getId());
        parkingTransaction.setCheckOut(LocalTime.now(ZoneId.of("GMT+7")));

        parkingTransaction.setSubTotal(parkingCalculation.getParkingTotal(
                        parkingTransaction.getCheckIn(),
                        parkingTransaction.getCheckOut(),
                        area.getHourPrice()
        ));

        area.setParkingCapacity(area.getParkingCapacity() + vehicle.getWeight());
        addParkingHistory(parkingTransaction, area);

        return parkingTransactionRepository.save(parkingTransaction);

    }

    @Override
    public Page<ParkingTransaction> findAll(Pageable pageable) {
        return parkingTransactionRepository.findAll(pageable);
    }

    @Override
    public ParkingTransaction findById(String s) {

        return parkingTransactionRepository.findById(s).get();
    }

    @Override
    public ParkingTransaction update(ParkingTransaction parkingTransaction) {
        return null;
    }

    @Override
    public List<ParkingTransaction> delete(String s) {
        return null;
    }

    private void existenceValidation(String id) {
        if(!parkingTransactionRepository.existsById(id)){
            throw  new ResponseStatusException(HttpStatus.NOT_FOUND,
                    ResponMessage.getResourceNotFound(ParkingTransaction.class.getSimpleName(), id));
        }
    }

    private void addParkingHistory(ParkingTransaction parkingTransaction, ParkingArea area) {
        ParkingTransactionHistory parkingTransactionHistory = new ParkingTransactionHistory();
        Duration duration = Duration.between(parkingTransaction.getCheckIn(), parkingTransaction.getCheckOut());
        Integer tempDuration = Math.toIntExact(duration.toMinutes());

        parkingTransactionHistory.setPoliceNumber(parkingTransaction.getPoliceNumber());
        parkingTransactionHistory.setParkingArea(area);
        parkingTransactionHistory.setDuration(tempDuration.intValue());
        parkingTransactionHistory.setTotal(parkingTransaction.getSubTotal());
        parkingTransactioHistoryService.register(parkingTransactionHistory);
    }
}
