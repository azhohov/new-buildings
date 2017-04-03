package com.azhohov.newbuildings.model;

/**
 * Created by Leshiy on 01.04.2017.
 */

public class Apartment {
    private long id;
    private Building building;
    private int floor;
    private double area;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Building getBuilding() {
        return building;
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
