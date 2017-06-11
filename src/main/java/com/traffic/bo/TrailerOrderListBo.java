package com.traffic.bo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("trailerOrderBo")
public class TrailerOrderListBo {
	
	private Long id;
	
	private Long trailerId;
	
	private String trailerName;
	
	private String status;
	
	private String phone;
	
	private Double star;
	
	private int sNumber;
	
	private int uNumber;
	
	private Long msgId;
	
	private String address;
	
	private Double lon;
	
	private Double lat;
	
	private String license;
	
	
	private Date createDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTrailerId() {
		return trailerId;
	}

	public void setTrailerId(Long trailerId) {
		this.trailerId = trailerId;
	}

	public String getTrailerName() {
		return trailerName;
	}

	public void setTrailerName(String trailerName) {
		this.trailerName = trailerName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Double getStar() {
		return star;
	}

	public void setStar(Double star) {
		this.star = star;
	}

	public int getsNumber() {
		return sNumber;
	}

	public void setsNumber(int sNumber) {
		this.sNumber = sNumber;
	}

	public int getuNumber() {
		return uNumber;
	}

	public void setuNumber(int uNumber) {
		this.uNumber = uNumber;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
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

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}
	
	
}
