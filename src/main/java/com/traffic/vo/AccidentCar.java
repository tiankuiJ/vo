package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("accidentCar")
public class AccidentCar {
    private Long id;

    private Long acId;

    private String license;

    private String phone;

    private String cardImgZ;

    private String cardImgF;

    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	@Override
	public String toString() {
		return "AccidentCar [id=" + id + ", acId=" + acId + ", license=" + license + ", phone=" + phone + ", cardImgZ="
				+ cardImgZ + ", cardImgF=" + cardImgF + ", createTime=" + createTime + "]";
	}
    
}