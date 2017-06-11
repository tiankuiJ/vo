package com.traffic.bo;

public class UserCardBo {
	//用户id
	private Long userId;
	//车牌
	private String license;
	//行驶证正面照
	private String tcardZ;
	//行驶证反面照
	private String tcardF;
	//驾驶证正面照
	private String dcardZ;
	//驾驶证反面照
	private String dcardF;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getLicense() {
		return license;
	}
	public void setLicense(String license) {
		this.license = license;
	}
	public String getTcardZ() {
		return tcardZ;
	}
	public void setTcardZ(String tcardZ) {
		this.tcardZ = tcardZ;
	}
	public String getTcardF() {
		return tcardF;
	}
	public void setTcardF(String tcardF) {
		this.tcardF = tcardF;
	}
	public String getDcardZ() {
		return dcardZ;
	}
	public void setDcardZ(String dcardZ) {
		this.dcardZ = dcardZ;
	}
	public String getDcardF() {
		return dcardF;
	}
	public void setDcardF(String dcardF) {
		this.dcardF = dcardF;
	}
	
	
	
	
}
