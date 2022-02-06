package com.company;

public class ParkingSlot {

    private int id;
    private String driversID;
    private String mobile;
    private boolean isAvailable;

    public ParkingSlot() {
        this.id = 0;
        this.driversID = "0";
        this.isAvailable = true;
        this.mobile = "0";
    }

    public ParkingSlot(int id) {
        this.id = id;
        this.driversID = "0";
        this.isAvailable = true;
        this.mobile = "0";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriversID() {
        return driversID;
    }

    public void setDriversID(String driversID) {
        this.driversID = driversID;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
