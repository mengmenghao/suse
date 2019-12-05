package com.sus.bean;

public class Device {
    private Integer deviceId;

    private String deviceContent;

    private Integer subscriberId;

    private String deviceStatus;

    private String process;

    public Device() {
    }

    public Device(Integer deviceId, String deviceContent, Integer subscriberId, String deviceStatus, String process) {
        this.deviceId = deviceId;
        this.deviceContent = deviceContent;
        this.subscriberId = subscriberId;
        this.deviceStatus = deviceStatus;
        this.process = process;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceContent() {
        return deviceContent;
    }

    public void setDeviceContent(String deviceContent) {
        this.deviceContent = deviceContent == null ? null : deviceContent.trim();
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus == null ? null : deviceStatus.trim();
    }

    public String getProcess() {
        return process;
    }

    public void setProcess(String process) {
        this.process = process == null ? null : process.trim();
    }
}