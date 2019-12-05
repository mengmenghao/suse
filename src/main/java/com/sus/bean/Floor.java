package com.sus.bean;

public class Floor {
    private Integer floorId;

    private String floorName;

    public Floor() {
        super();
    }

    public Floor(Integer floorId, String floorName) {
        this.floorId = floorId;
        this.floorName = floorName;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName == null ? null : floorName.trim();
    }
}