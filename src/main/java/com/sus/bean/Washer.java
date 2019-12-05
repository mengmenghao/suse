package com.sus.bean;

public class Washer {
    private Integer washerId;

    private String washerName;

    private String washerStatus;

    public Integer getWasherId() {
        return washerId;
    }

    public void setWasherId(Integer washerId) {
        this.washerId = washerId;
    }

    public String getWasherName() {
        return washerName;
    }

    public void setWasherName(String washerName) {
        this.washerName = washerName == null ? null : washerName.trim();
    }

    public String getWasherStatus() {
        return washerStatus;
    }

    public void setWasherStatus(String washerStatus) {
        this.washerStatus = washerStatus == null ? null : washerStatus.trim();
    }
}