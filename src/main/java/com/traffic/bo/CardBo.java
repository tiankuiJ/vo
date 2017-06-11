package com.traffic.bo;


public class CardBo {
	//用户id
	private Long userId;
	//驾驶证正面
	private String driveCardZ;
	//驾驶证反面
	private String driveCardF;
	//车牌号
	private String license;
	//行驶证正面
	private String licenseCardZ;
	//行驶证反面
	private String licenseCardF;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
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
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	
	
	
}
