package com.example.entity;

import com.sun.istack.NotNull;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "mst_parkingowner")
public class ParkingOwner {

    @Id
    @GeneratedValue(generator = "uuid-generator")
    @GenericGenerator(name = "uuid-generator", strategy = "uuid")
    private String id;

    @NotNull
    private String name;
    private String telephone;
    private String address;

    @OneToMany(mappedBy = "parkingOwner")
    private List<ParkingArea> owner = new ArrayList<>();

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getAddress() {
        return address;
    }

    public List<ParkingArea> getOwner() {
        return owner;
    }
}
