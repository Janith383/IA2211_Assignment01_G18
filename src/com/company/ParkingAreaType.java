package com.company;
import java.util.Scanner;

public class ParkingAreaType {
    private ParkingSlot slots[];
    private String name;

    public ParkingAreaType(int num, String name) {
        this.name = name;
        this.slots = new ParkingSlot[num];
        for(int i=0; i< slots.length; i++) {
            this.slots[i] = new ParkingSlot((i+1));
        }
    }

    public ParkingSlot[] getSlots() {
        return slots;
    }

    public void setSlots(ParkingSlot[] slots) {
        this.slots = slots;
    }

    public String getName() {
        return name;
    }

    public ParkingSlot isAvailable() {
        for (int i = 0; i< slots.length; i++) {
            if (slots[i].isAvailable() == true) {
                return slots[i];
            }
        }
        return null;
    }

    public ParkingSlot getParkingSlot(int slotID) {
        for (int i=0; i< slots.length; i++) {
            if (slots[i].getId() == slotID) {
                return slots[i];
            }
        }
        return null;
    }

    public ParkingSlot[] availableSlots() {
        int num=0;
        for (int i=0; i< slots.length; i++) {
            if (slots[i].isAvailable() == true) {
                num+=1;
            }
        }
        ParkingSlot[] availableSlots = new ParkingSlot[num];
        num = 0;
        for (int i=0; i< slots.length; i++) {
            if (slots[i].isAvailable() == true) {
                availableSlots[num] = slots[i];
                num++;
            }
        }
        return availableSlots;
    }

    public void reserveSlot(ParkingSlot slot) {
        slot.setAvailable(false);
    }

}
