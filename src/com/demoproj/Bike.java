package com.demoproj;

public class Bike {
    String vehicleName;
    String bColour;
    int gears;

    private int vehicleSpeed;
    private int price;



    public Bike() {

    }

    public Bike(String name, String bColour, int gears) {
        this.vehicleName = name;
        this.bColour = bColour;
        this.gears = gears;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String name) {
        this.vehicleName = name;
    }

    public String getbColour() {
        return bColour;
    }

    public void setbColour(String bColour) {
        this.bColour = bColour;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(int vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
