package com.traffic.vo;

import java.beans.PropertyEditor;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.type.Alias;

@Alias("accident")
public class Accident {
	private Long id;

	private Long msgId;

	private Long userId;

	private String license;
	//驾驶证正面
	private String cardImgZ;
	//驾驶证反面
	private String cardImgF;
	//行驶证正面
	private String lCardImgZ;
	//行驶证反面
	private String lCardImgF;
	//安全员id
	private Integer safetyId;

	private String phone;


	private String handleType;

	private Date createDate;

	private String address;

	private Double lon;

	private Double lat;


	private List<Long> ids;

	// 省
	private String province;
	// 市
	private String city;
	// 县
	private String county;
	//状态
	private String status;
	//事故文字描述
	private String remark;
	//事故语音描述
	private String voiceRemark;
	//事故赔偿结果语音地址
	private String voiceResult;
	
	//当事车id
	private Long carId;
	//天气
    private String weather;
    //保险公司id
    private Long insCompanyId;
    //保单号
    private String policyNumber;
    //保单图片
    private String policyImg;
    //驾驶人姓名
    private String driverName;
    //赔偿责任及结果
    private String result;
    //交通方式
    private String trafficType;
    //搜索字段
    private String searchKey;
    
    private Date reciveTime;
    //保险公司人员id
    private Long icUserId;
    
    private Long tpId;
    
    private String idNumber;
    //是否需要拖车(0不需要/1需要)
    private Integer needTrailer;
    //拖车公司id
    private Long trailerId;
    //是否需要推送到保险公司(0不需要/1需要)
    private Integer pushToIns;
    //安全员和用户提交协商处理事故关联
    private Long cId;
    
    private Date trailerTime;
    
    private String viewResource;
    
    
    

	public String getViewResource() {
		return viewResource;
	}

	public void setViewResource(String viewResource) {
		this.viewResource = viewResource;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

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
		this.license = license == null ? null : license.trim();
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

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType == null ? null : handleType.trim();
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address == null ? null : address.trim();
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


	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
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

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public Long getInsCompanyId() {
		return insCompanyId;
	}

	public void setInsCompanyId(Long insCompanyId) {
		this.insCompanyId = insCompanyId;
	}

	public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyImg() {
		return policyImg;
	}

	public void setPolicyImg(String policyImg) {
		this.policyImg = policyImg;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getVoiceRemark() {
		return voiceRemark;
	}

	public void setVoiceRemark(String voiceRemark) {
		this.voiceRemark = voiceRemark;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getTrafficType() {
		return trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getVoiceResult() {
		return voiceResult;
	}

	public void setVoiceResult(String voiceResult) {
		this.voiceResult = voiceResult;
	}

	public Date getReciveTime() {
		return reciveTime;
	}

	public void setReciveTime(Date reciveTime) {
		this.reciveTime = reciveTime;
	}

	public Long getIcUserId() {
		return icUserId;
	}

	public void setIcUserId(Long icUserId) {
		this.icUserId = icUserId;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Integer getNeedTrailer() {
		return needTrailer;
	}

	public void setNeedTrailer(Integer needTrailer) {
		this.needTrailer = needTrailer;
	}

	public Long getTrailerId() {
		return trailerId;
	}

	public void setTrailerId(Long trailerId) {
		this.trailerId = trailerId;
	}

	public String getlCardImgZ() {
		return lCardImgZ;
	}

	public void setlCardImgZ(String lCardImgZ) {
		this.lCardImgZ = lCardImgZ;
	}

	public String getlCardImgF() {
		return lCardImgF;
	}

	public void setlCardImgF(String lCardImgF) {
		this.lCardImgF = lCardImgF;
	}

	public Integer getSafetyId() {
		return safetyId;
	}

	public void setSafetyId(Integer safetyId) {
		this.safetyId = safetyId;
	}

	public Integer getPushToIns() {
		return pushToIns;
	}

	public void setPushToIns(Integer pushToIns) {
		this.pushToIns = pushToIns;
	}

	public Long getcId() {
		return cId;
	}

	public void setcId(Long cId) {
		this.cId = cId;
	}

	public Date getTrailerTime() {
		return trailerTime;
	}

	public void setTrailerTime(Date trailerTime) {
		this.trailerTime = trailerTime;
	}


	
	


}