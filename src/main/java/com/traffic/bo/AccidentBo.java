package com.traffic.bo;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("accidentBo")
public class AccidentBo {
	//事故消息id
	private Long msgId;
	//事故涉案车数哇哈哈哈1111111112
	private int carCount;
	//事故地点
	private String address;
	//事故时间
	private Date createDate;
	//纬度
	private Double lat;
	//经度
	private Double lon;
	//省
	private String province;
	//市
	private String city;
	//县
	private String county;
	//状态
	private String status;
	//车牌
	private List<String> licenses;
	//是否是安全员提交
	private boolean safety; 
	
	private String handleType;
	
	private Long safetyId;
	public Long getMsgId() {
		return msgId;
	}
	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}
	public int getCarCount() {
		return carCount;
	}
	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Double getLat() {
		return lat;
	}
	public void setLat(Double lat) {
		this.lat = lat;
	}
	public Double getLon() {
		return lon;
	}
	public void setLon(Double lon) {
		this.lon = lon;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {	
		this.status = status;
	}
	public String getHandleType() {
		return handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}
	public List<String> getLicenses() {
		return licenses;
	}
	public void setLicenses(List<String> licenses) {
		this.licenses = licenses;
	}
	public boolean isSafety() {
		return safetyId==null?false:true;
	}
	public void setSafety(boolean safety) {
		this.safety = safety;
	}
	public Long getSafetyId() {
		return safetyId;
	}
	public void setSafetyId(Long safetyId) {
		this.safetyId = safetyId;
	}
	
	
	
	
}
