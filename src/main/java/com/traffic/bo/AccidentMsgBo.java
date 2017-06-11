package com.traffic.bo;

import java.util.Date;
import java.util.List;

import com.traffic.vo.AccidentData;
import com.traffic.vo.Organization;
import com.traffic.vo.TpData;

/**
 * 事故消息信息 公司名称：四川咖菲科技有限公司 联系电话： 13398376166 联系人： 陈德强 邮箱：200751119@qq.com 微信号：
 * mycdq168 地址：四川省绵阳市创新中心二期412 官方网站 : http://www.kafeikeji.com/ 微信公众号： 咖啡科技
 * 项目名称：安县交警 类名称： 类描述： 创建人：田奎 创建时间： 2016年10月13日 修改人： 修改时间： 修改备注：
 * 
 * @version 1.0
 */
public class AccidentMsgBo {
	// 天气
	private String weather;
	// 事故涉案车辆数
	private int carCount;
	// 车牌号
	private List<String> licenses;
	// 事故时间
	private Date createTime;
	// 事故地点
	private String address;
	// 事故介绍集合
	private List<AccidentRemarkBo> remarks;
	// 状态
	private String status;
	// 处理方式
	private String handleType;
	// 交警取证图片集合
	private List<TpData> tpDataImgs;
	// 交警取证视频集合
	private List<TpData> tpDataVideos;
	// 保险公司取证图片
	private List<TpData> insDataImgs;
	// 保险公司取证视频
	private List<TpData> insVideos;

	// 交警队id
	private String ptName;

	// 交警队地址
	private String ptAddress;
	// 交警建议领取责任书或处理时间
	private Date receviceTime;
	// 处理时间
	private Date handleTime;

	private Double lon;

	private Double lat;
	//交警名称
	private String tpName;
	//交警警号
	private String userName;
	//交警电话
	private String phone;

	private List<Organization> orgs;

	private Long ptId;

	private String county;
	// 是否拥有责任书(直接被保险公司处理的事故是没有责任书的)
	private boolean haveResponsility;

	// 事故文字介绍
	private String remark;

	// 事故语音介绍
	private String voiceRemark;

	// 事故照片集合
	private List<AccidentData> photoList;

	// 事故视频集合
	private List<AccidentData> videoList;

	private String voiceResult;

	private String result;
	//保险公司数组
	private List<ConsultInsBo> insBo;
	//拖车数组
	private List<ConsultInsBo> trailerBo;
	//安全员电话
	private String safeTel;
	//安全员姓名
	private String safeName;
	//交警处理状态
	private String tpHandleStatus;
	
	

	public String getTpHandleStatus() {
		return tpHandleStatus;
	}

	public void setTpHandleStatus(String tpHandleStatus) {
		this.tpHandleStatus = tpHandleStatus;
	}

	public int getCarCount() {
		return carCount;
	}

	public String getSafeName() {
		return safeName;
	}

	public void setSafeName(String safeName) {
		this.safeName = safeName;
	}

	public void setCarCount(int carCount) {
		this.carCount = carCount;
	}

	public List<String> getLicenses() {
		return licenses;
	}

	public void setLicenses(List<String> licenses) {
		this.licenses = licenses;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<AccidentRemarkBo> getRemarks() {
		return remarks;
	}

	public void setRemarks(List<AccidentRemarkBo> remarks) {
		this.remarks = remarks;
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

	public List<TpData> getTpDataImgs() {
		return tpDataImgs;
	}

	public void setTpDataImgs(List<TpData> tpDataImgs) {
		this.tpDataImgs = tpDataImgs;
	}

	public List<TpData> getTpDataVideos() {
		return tpDataVideos;
	}

	public void setTpDataVideos(List<TpData> tpDataVideos) {
		this.tpDataVideos = tpDataVideos;
	}

	public List<TpData> getInsDataImgs() {
		return insDataImgs;
	}

	public void setInsDataImgs(List<TpData> insDataImgs) {
		this.insDataImgs = insDataImgs;
	}

	public List<TpData> getInsVideos() {
		return insVideos;
	}

	public void setInsVideos(List<TpData> insVideos) {
		this.insVideos = insVideos;
	}

	@Override
	public String toString() {
		return "AccidentMsgBo [weather=" + weather + ", carCount=" + carCount + ", licenses=" + licenses
				+ ", createTime=" + createTime + ", address=" + address + ", remarks=" + remarks + ", status=" + status
				+ ", handleType=" + handleType + ", tpDataImgs=" + tpDataImgs + ", tpDataVideos=" + tpDataVideos
				+ ", insDataImgs=" + insDataImgs + ", insVideos=" + insVideos + ", ptName=" + ptName + ", ptAddress="
				+ ptAddress + ", receviceTime=" + receviceTime + ", handleTime=" + handleTime + ", lon=" + lon
				+ ", lat=" + lat + ", tpName=" + tpName + ", orgs=" + orgs + ", ptId=" + ptId + ", county=" + county
				+ "]";
	}

	public String getTpName() {
		return tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

	public String getPtName() {
		return ptName;
	}

	public void setPtName(String ptName) {
		this.ptName = ptName;
	}

	public String getPtAddress() {
		return ptAddress;
	}

	public void setPtAddress(String ptAddress) {
		this.ptAddress = ptAddress;
	}

	public Date getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public Date getReceviceTime() {
		return receviceTime;
	}

	public void setReceviceTime(Date receviceTime) {
		this.receviceTime = receviceTime;
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

	public List<Organization> getOrgs() {
		return orgs;
	}

	public void setOrgs(List<Organization> orgs) {
		this.orgs = orgs;
	}

	public String getCounty() {
		return county;
	}

	public void setCounty(String county) {
		this.county = county;
	}

	public Long getPtId() {
		return ptId;
	}

	public void setPtId(Long ptId) {
		this.ptId = ptId;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public boolean isHaveResponsility() {
		return haveResponsility;
	}

	public void setHaveResponsility(boolean haveResponsility) {
		this.haveResponsility = haveResponsility;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getVoiceRemark() {
		return voiceRemark;
	}

	public void setVoiceRemark(String voiceRemark) {
		this.voiceRemark = voiceRemark;
	}

	public List<AccidentData> getPhotoList() {
		return photoList;
	}

	public void setPhotoList(List<AccidentData> photoList) {
		this.photoList = photoList;
	}

	public List<AccidentData> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<AccidentData> videoList) {
		this.videoList = videoList;
	}

	public String getVoiceResult() {
		return voiceResult;
	}

	public void setVoiceResult(String voiceResult) {
		this.voiceResult = voiceResult;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
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

	public List<ConsultInsBo> getInsBo() {
		return insBo;
	}

	public void setInsBo(List<ConsultInsBo> insBo) {
		this.insBo = insBo;
	}

	public List<ConsultInsBo> getTrailerBo() {
		return trailerBo;
	}

	public void setTrailerBo(List<ConsultInsBo> trailerBo) {
		this.trailerBo = trailerBo;
	}

	public String getSafeTel() {
		return safeTel;
	}

	public void setSafeTel(String safeTel) {
		this.safeTel = safeTel;
	}

	
	

}
