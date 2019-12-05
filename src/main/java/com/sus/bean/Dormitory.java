package com.sus.bean;

public class Dormitory {
    private Integer dormitoryId;

    private String dormitoryName;

    private Integer floorId;

    private Floor floor;

    public Dormitory() {
        super();
    }

    public Dormitory(Integer dormitoryId, String dormitoryName, Integer floorId, Floor floor) {
        this.dormitoryId = dormitoryId;
        this.dormitoryName = dormitoryName;
        this.floorId = floorId;
        this.floor = floor;
    }

    public Dormitory(Integer dormitoryId, String dormitoryName, Integer floorId) {
        this.dormitoryId = dormitoryId;
        this.dormitoryName = dormitoryName;
        this.floorId = floorId;
    }

    public Floor getFloor() {
        return floor;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public Integer getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(Integer dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getDormitoryName() {
        return dormitoryName;
    }

    public void setDormitoryName(String dormitoryName) {
        this.dormitoryName = dormitoryName == null ? null : dormitoryName.trim();
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }
}