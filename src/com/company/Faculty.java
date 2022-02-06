package com.company;

public class Faculty {

    private String name;
    private StandardType standard;
    private HandicappedType handicapped;
    private LongVehicleType longVehicle;

    public Faculty(String name, int standard, int handicapped, int longVehicle) {
        this.name = name;
        this.standard = new StandardType(standard);
        this.handicapped = new HandicappedType(handicapped);
        this.longVehicle = new LongVehicleType(longVehicle);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StandardType getStandard() {
        return standard;
    }

    public void setStandard(StandardType standard) {
        this.standard = standard;
    }

    public HandicappedType getHandicapped() {
        return handicapped;
    }

    public void setHandicapped(HandicappedType handicapped) {
        this.handicapped = handicapped;
    }

    public LongVehicleType getLongVehicle() {
        return longVehicle;
    }

    public void setLongVehicle(LongVehicleType longVehicle) {
        this.longVehicle = longVehicle;
    }
}

