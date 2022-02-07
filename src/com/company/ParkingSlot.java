//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDriversID() {
        return this.driversID;
    }

    public void setDriversID(String driversID) {
        this.driversID = driversID;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
