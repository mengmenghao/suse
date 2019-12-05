package com.sus.bean;

public class Announcement {
    private Integer announcementId;

    private String announcementName;

    private String announcementContent;

    private String announcementTime;

    private Integer subscriberId;

    public Announcement() {
    }

    public Announcement(Integer announcementId, String announcementName, String announcementContent, String announcementTime, Integer subscriberId) {
        this.announcementId = announcementId;
        this.announcementName = announcementName;
        this.announcementContent = announcementContent;
        this.announcementTime = announcementTime;
        this.subscriberId = subscriberId;
    }

    public Integer getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Integer announcementId) {
        this.announcementId = announcementId;
    }

    public String getAnnouncementName() {
        return announcementName;
    }

    public void setAnnouncementName(String announcementName) {
        this.announcementName = announcementName == null ? null : announcementName.trim();
    }

    public String getAnnouncementContent() {
        return announcementContent;
    }

    public void setAnnouncementContent(String announcementContent) {
        this.announcementContent = announcementContent == null ? null : announcementContent.trim();
    }

    public String getAnnouncementTime() {
        return announcementTime;
    }

    public void setAnnouncementTime(String announcementTime) {
        this.announcementTime = announcementTime == null ? null : announcementTime.trim();
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }
}