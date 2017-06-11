package com.traffic.bo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("carsInfoBo")
public class CarsInfoBo {

	private Long id;
	
	private String headImg;

	private String userName;

	private String phone;

	private String driveCardZ;

	private String driveCardF;

	private String licenseCardZ;

	private String licenseCardF;

	private String carNo;

	private String models;
	private String engineNo;
	private String frameNo;
	private Date onDate;
	/**
	 * 投保公司Id
	 */
	private Long insCompanyId;
	/**
	 * 投保公司名称
	 */
	private String insCompanyName;
	/**
	 * 保单图片
	 */
	private String policyImg;
	
	private String policyNumber;
	
	private String owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDriveCardZ() {
		return driveCardZ;
	}

	public void setDriveCardZ(String driveCardZ) {
		this.driveCardZ = driveCardZ;
	}

	public String getDriveCardF() {
		return driveCardF;
	}

	public void setDriveCardF(String driveCardF) {
		this.driveCardF = driveCardF;
	}

	public String getLicenseCardZ() {
		return licenseCardZ;
	}

	public void setLicenseCardZ(String licenseCardZ) {
		this.licenseCardZ = licenseCardZ;
	}

	public String getLicenseCardF() {
		return licenseCardF;
	}

	public void setLicenseCardF(String licenseCardF) {
		this.licenseCardF = licenseCardF;
	}

	public String getCarNo() {
		return carNo;
	}

	public void setCarNo(String carNo) {
		this.carNo = carNo;
	}

	public String getModels() {
		return models;
	}

	public void setModels(String models) {
		this.models = models;
	}

	public String getEngineNo() {
		return engineNo;
	}

	public void setEngineNo(String engineNo) {
		this.engineNo = engineNo;
	}

	public String getFrameNo() {
		return frameNo;
	}

	public void setFrameNo(String frameNo) {
		this.frameNo = frameNo;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public Long getInsCompanyId() {
		return insCompanyId;
	}

	public void setInsCompanyId(Long insCompanyId) {
		this.insCompanyId = insCompanyId;
	}

	public String getInsCompanyName() {
		return insCompanyName;
	}

	public void setInsCompanyName(String insCompanyName) {
		this.insCompanyName = insCompanyName;
	}

	public String getPolicyImg() {
		return policyImg;
	}

	public void setPolicyImg(String policyImg) {
		this.policyImg = policyImg;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

}
