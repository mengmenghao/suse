package com.sus.bean;

public class WaterCress {
    private Integer watercressId;

    private Integer watercressVolume;

    private Integer subscriberId;

    private String appointmentTime;

    private String extractionTime;

    private String status;

    public Integer getWatercressId() {
        return watercressId;
    }

    public void setWatercressId(Integer watercressId) {
        this.watercressId = watercressId;
    }

    public Integer getWatercressVolume() {
        return watercressVolume;
    }

    public void setWatercressVolume(Integer watercressVolume) {
        this.watercressVolume = watercressVolume;
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(String appointmentTime) {
        this.appointmentTime = appointmentTime == null ? null : appointmentTime.trim();
    }

    public String getExtractionTime() {
        return extractionTime;
    }

    public void setExtractionTime(String extractionTime) {
        this.extractionTime = extractionTime == null ? null : extractionTime.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}