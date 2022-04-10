package com.example.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "trx_transactionhistory")
public class ParkingTransactionHistory {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;

    private String policeNumber;

    @JsonIgnoreProperties("transactions")
    @ManyToOne
    @JoinColumn(name = "parking_area")
    private ParkingArea parkingArea;

    @Column(name = "parking_duration")
    private Integer duration;
    @Column(name = "sub_total")
    private Integer Total;

    public String getId() {
        return id;
    }

    public String getPoliceNumber() {
        return policeNumber;
    }

    public ParkingArea getParkingArea() {
        return parkingArea;
    }

    public Integer getDuration() {
        return duration;
    }

    public Integer getTotal() {
        return Total;
    }

    public void setPoliceNumber(String policeNumber) {
        this.policeNumber = policeNumber;
    }

    public void setParkingArea(ParkingArea parkingArea) {
        this.parkingArea = parkingArea;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public void setTotal(Integer total) {
        Total = total;
    }
}
