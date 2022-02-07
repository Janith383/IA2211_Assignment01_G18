//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.company;

public class ParkingAreaType {
    private ParkingSlot[] slots;
    private String name;

    public ParkingAreaType(int num, String name) {
        this.name = name;
        this.slots = new ParkingSlot[num];

        for(int i = 0; i < this.slots.length; ++i) {
            this.slots[i] = new ParkingSlot(i + 1);
        }

    }

    public ParkingSlot[] getSlots() {
        return this.slots;
    }

    public void setSlots(ParkingSlot[] slots) {
        this.slots = slots;
    }

    public String getName() {
        return this.name;
    }

    public ParkingSlot isAvailable() {
        for(int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i].isAvailable()) {
                return this.slots[i];
            }
        }

        return null;
    }

    public ParkingSlot getParkingSlot(String driversID) {
        for(int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i].getDriversID() == driversID) {
                return this.slots[i];
            }
        }

        return null;
    }

    public ParkingSlot getParkingSlot(int slotID) {
        for(int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i].getId() == slotID) {
                return this.slots[i];
            }
        }

        return null;
    }

    public ParkingSlot[] availableSlots() {
        int num = 0;

        for(int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i].isAvailable()) {
                ++num;
            }
        }

        ParkingSlot[] availableSlots = new ParkingSlot[num];
        num = 0;

        for(int i = 0; i < this.slots.length; ++i) {
            if (this.slots[i].isAvailable()) {
                availableSlots[num] = this.slots[i];
                ++num;
            }
        }

        return availableSlots;
    }

    public ParkingSlot[] reservedSlots() {
        int num = 0;

        for(int i = 0; i < this.slots.length; ++i) {
            if (!this.slots[i].isAvailable()) {
                ++num;
            }
        }

        ParkingSlot[] reservedSlots = new ParkingSlot[num];
        num = 0;

        for(int i = 0; i < this.slots.length; ++i) {
            if (!this.slots[i].isAvailable()) {
                reservedSlots[num] = this.slots[i];
                ++num;
            }
        }

        return reservedSlots;
    }

    public void reserveSlot(ParkingSlot slot) {
        slot.setAvailable(false);
    }

    public void unReserveSlot(ParkingSlot slot) {
        slot.setAvailable(true);
    }
}
