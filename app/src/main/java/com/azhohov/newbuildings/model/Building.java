package com.azhohov.newbuildings.model;

/**
 * Created by Leshiy on 01.04.2017.
 */

public class Building {
    private long id;
    private String name;
    private int floorsCount;
    private Builder builder;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFloorsCount() {
        return floorsCount;
    }

    public void setFloorsCount(int floorsCount) {
        this.floorsCount = floorsCount;
    }

    public Builder getBuilder() {
        return builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }
}
