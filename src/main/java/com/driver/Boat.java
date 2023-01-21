package com.driver;

public class Boat implements WaterVehicle {
    // take two varible
    private String name;
    private int capacity;  // to avoid voilating encapsulation principle make private
                  // and also take getters and setters;
    // making constructor of Boat class
    public Boat(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String getVehicleName() {
        return this.name;
    }

    @Override
    public int getVehicleCapacity() {
        return this.capacity;
    }
}
