package com.example.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalTime;

@Entity
@Table(name = "trx_parkingtransaction")
public class ParkingTransaction {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    private String policeNumber;

    @ManyToOne
    @JoinColumn(name = "vehicle_type")
    private Vehicle vehicle;

    private LocalTime checkIn;
    private LocalTime checkOut;
    @Column(name="price_total")
    private Integer subTotal;

    @JsonIgnoreProperties("transactions")
    @ManyToOne
    @JoinColumn(name = "parking_id")
    private ParkingArea parkingArea;

    public String getId() {
        return id;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }
//
//    public String getVehicleType() {
//        return vehicleType;
//    }
    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalTime getCheckIn() {
        return checkIn;
    }

    public LocalTime getCheckOut() {
        return checkOut;
    }

    public Integer getSubTotal() {
        return subTotal;
    }

    public ParkingArea getParkingArea() {
        return parkingArea;
    }

    public void setCheckIn(LocalTime checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(LocalTime checkOut) {
        this.checkOut = checkOut;
    }

    public void setSubTotal(Integer subTotal) {
        this.subTotal = subTotal;
    }
}
