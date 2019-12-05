package com.sus.bean;

import javax.validation.constraints.Pattern;

public class Subscriber {
    private Integer subscriberId;

    @Pattern(regexp = "(^[a-zA-Z0-9_-]{4,16}$)|(^[\u2E80-\u9FFF]{2,5})"
            ,message = "用户名必须是4-16位数字和字母的组合或者2-5位中文")
    private String subscriberName;

    @Pattern(regexp = "(^[a-z0-9_-]{6,18}$)",message = "密码是6-18位字母、数字、下划线")
    private String subscriberPassword;

    private Integer subscriberPermission;

    private Integer dormitoryId;

    private Dormitory dormitory;

    public Subscriber() {
        super();
    }

    public Subscriber(Integer subscriberId, String subscriberName, String subscriberPassword, Integer subscriberPermission, Integer dormitoryId, Dormitory dormitory) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.subscriberPassword = subscriberPassword;
        this.subscriberPermission = subscriberPermission;
        this.dormitoryId = dormitoryId;
        this.dormitory = dormitory;
    }
    public Subscriber(Integer subscriberId, String subscriberName, String subscriberPassword, Integer subscriberPermission, Integer dormitoryId) {
        this.subscriberId = subscriberId;
        this.subscriberName = subscriberName;
        this.subscriberPassword = subscriberPassword;
        this.subscriberPermission = subscriberPermission;
        this.dormitoryId = dormitoryId;

    }

    public Dormitory getDormitory() {
        return dormitory;
    }

    public void setDormitory(Dormitory dormitory) {
        this.dormitory = dormitory;
    }

    public Integer getSubscriberId() {
        return subscriberId;
    }

    public void setSubscriberId(Integer subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getSubscriberName() {
        return subscriberName;
    }

    public void setSubscriberName(String subscriberName) {
        this.subscriberName = subscriberName == null ? null : subscriberName.trim();
    }

    public String getSubscriberPassword() {
        return subscriberPassword;
    }

    public void setSubscriberPassword(String subscriberPassword) {
        this.subscriberPassword = subscriberPassword == null ? null : subscriberPassword.trim();
    }

    public Integer getSubscriberPermission() {
        return subscriberPermission;
    }

    public void setSubscriberPermission(Integer subscriberPermission) {
        this.subscriberPermission = subscriberPermission;
    }

    public Integer getDormitoryId() {
        return dormitoryId;
    }

    public void setDormitoryId(Integer dormitoryId) {
        this.dormitoryId = dormitoryId;
    }

}