package com.example.calculation;

import java.math.RoundingMode;
import java.time.Duration;
import java.time.LocalTime;

public class ParkingCalculation {
    private Integer totalParkir;
    static final Integer nextHour = 1000;
    static final Integer maxHour = 25000;


    public Integer getParkingTotal(LocalTime checkIn,LocalTime checkOut,Integer firtHours){
        Duration duration = Duration.between(checkIn,checkOut);
        Double tempDuration = Double.valueOf(duration.toMinutes()/60.0);

        Integer durationPariking = Math.toIntExact(Math.round(tempDuration.doubleValue()));

        if (durationPariking.intValue() <= 1){
            totalParkir = firtHours;
        }else if (tempDuration.intValue() > 1){
            totalParkir = (tempDuration.intValue() - 1) * nextHour + firtHours;
        }else if (tempDuration.intValue() >= 24){
            totalParkir = maxHour;
        }
        return totalParkir;
    }


}
