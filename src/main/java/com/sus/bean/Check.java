package com.sus.bean;

public class Check {
    private Integer checkId;

    private Integer floorId;

    private Integer dormitoryId;

    private String checkTime;

    private String checkPhoto;

    public Integer getCheckId() {
        return checkId;
    }

    public void setCheckId(Integer checkId) {
        this.checkId = checkId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public Integer getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(Integer dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

    public String getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(String checkTime) {
        this.checkTime = checkTime == null ? null : checkTime.trim();
    }

    public String getCheckPhoto() {
        return checkPhoto;
    }

    public void setCheckPhoto(String checkPhoto) {
        this.checkPhoto = checkPhoto == null ? null : checkPhoto.trim();
    }
}