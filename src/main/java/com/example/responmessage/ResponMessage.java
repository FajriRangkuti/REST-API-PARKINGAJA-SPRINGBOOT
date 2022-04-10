package com.example.responmessage;

public class ResponMessage {

    public static final String RESOURCE_NOT_FOUND = "%s With id=%s, Not Found";

    //public static final String PARKING_AREA_TYPE = "%s Area Cannot parking Couse not Match For = %s";

    public static final String PARKING_AREA_TYPE = "%s With name = %s, is cannot Parking in this area";

    public static final String POLICE_NUMBER_CHECK = "%s Police Number with = %s, Already CheckIn";

    public static final String PARKING_FULL = "%s Cannot Parking = %s, Cause No More Slot";


    public static String getResourceNotFound(String className,String id){
        return String.format(RESOURCE_NOT_FOUND, className, id);
    }

    public static String getResourceNotParkingNotMatch(String className,String id){
        return String.format(PARKING_AREA_TYPE, className, id);
    }

    public static String getResourceParkingFull(String className,String id){
        return String.format(PARKING_FULL, className, id);
    }
}
