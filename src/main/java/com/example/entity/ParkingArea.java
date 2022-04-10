package com.example.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@Entity
@Table(name = "mst_parking")
public class ParkingArea {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;
    private String name;
    private String address;

    @Column(name = "areas")
    private String areaCoverage;
    @Column(name = "capacity")
    private Integer parkingCapacity;

    @ManyToOne
    @JoinColumn(name = "category")
    private Vehicle vehicle;

    @Column(name = "price")
    private Integer hourPrice;

    @JsonIgnoreProperties("owner")
    @ManyToOne
    @JoinColumn(name = "ownerparking_id")
    private ParkingOwner parkingOwner;

    @OneToMany(mappedBy = "parkingArea")
    private List<ParkingTransaction> transactions = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getAreaCoverage() {
        return areaCoverage;
    }

    public Integer getParkingCapacity() {
        return parkingCapacity;
    }

//    //public String getCategory() {
//        return category;
//    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public Integer getHourPrice() {
        return hourPrice;
    }

    public ParkingOwner getParkingOwner() {
        return parkingOwner;
    }

    public List<ParkingTransaction> getTransactions() {
        return transactions;
    }

    public void setParkingCapacity(Integer parkingCapacity) {
        this.parkingCapacity = parkingCapacity;
    }
}
