package com.traffic.vo;

import java.util.Date;

public class AgreementDetail {
    private Long id;

    private Long agId;

    private Long userId;

    private String cardImgZ;

    private String cardImgF;

    private String phone;

    private String trafficType;

    private String license;

    private String percent;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAgId() {
        return agId;
    }

    public void setAgId(Long agId) {
        this.agId = agId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getCardImgZ() {
        return cardImgZ;
    }

    public void setCardImgZ(String cardImgZ) {
        this.cardImgZ = cardImgZ == null ? null : cardImgZ.trim();
    }

    public String getCardImgF() {
        return cardImgF;
    }

    public void setCardImgF(String cardImgF) {
        this.cardImgF = cardImgF == null ? null : cardImgF.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType == null ? null : trafficType.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent == null ? null : percent.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}