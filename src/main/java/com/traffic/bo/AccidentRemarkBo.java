package com.traffic.bo;

import java.util.List;

import com.traffic.vo.AccidentData;

/**
 * 
 * 事故介绍 公司名称：四川咖菲科技有限公司 联系电话： 13398376166 联系人： 陈德强 邮箱：200751119@qq.com 微信号：
 * mycdq168 地址：四川省绵阳市创新中心二期412 官方网站 : http://www.kafeikeji.com/ 微信公众号： 咖啡科技
 * 项目名称：安县交警 类名称： 类描述： 创建人：田奎 创建时间： 2016年10月13日 修改人： 修改时间： 修改备注：
 * 
 * @version 1.0
 */
public class AccidentRemarkBo {

	private Long id;

	// 事故照片集合
	private List<AccidentData> photoList;

	// 事故视频集合
	private List<AccidentData> videoList;

	// 事故文字介绍
	private String remark;

	// 事故语音介绍
	private String voiceRemark;
	// 用户id
	private Long userId;
	// 车主名称
	private String name;
	// 车主电话
	private String phone;
	// 驾驶证号
	private String idNumber;
	// 车牌号
	private String license;
	// 交通方式
	private String trafficType;
	// 投保公司
	private String insName;
	// 保单号
	private String policyNumber;
	// 保单图片
	private String policyImg;
	// 行驶证正面
	private String carCardZ;
	// 行驶证反面
	private String carCardF;
	// 驾驶证正面
	private String driveCardImgZ;
	// 驾驶证反面
	private String driveCardImgF;

	private String voiceResult;

	private String result;

	private Long carId;
	//保险公司人员姓名
	private  String insUserName;
	//保险公司人员电话
	private  String insUserPhone;
	

	public String getInsUserName() {
		return insUserName;
	}

	public void setInsUserName(String insUserName) {
		this.insUserName = insUserName;
	}

	public String getInsUserPhone() {
		return insUserPhone;
	}

	public void setInsUserPhone(String insUserPhone) {
		this.insUserPhone = insUserPhone;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCarCardZ() {
		return carCardZ;
	}

	public void setCarCardZ(String carCardZ) {
		this.carCardZ = carCardZ;
	}

	public String getCarCardF() {
		return carCardF;
	}

	public void setCarCardF(String carCardF) {
		this.carCardF = carCardF;
	}

	public String getDriveCardImgZ() {
		return driveCardImgZ;
	}

	public void setDriveCardImgZ(String driveCardImgZ) {
		this.driveCardImgZ = driveCardImgZ;
	}

	public String getDriveCardImgF() {
		return driveCardImgF;
	}

	public void setDriveCardImgF(String driveCardImgF) {
		this.driveCardImgF = driveCardImgF;
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

	public Long getCarId() {
		return carId;
	}

	public void setCarId(Long carId) {
		this.carId = carId;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getTrafficType() {
		return trafficType;
	}

	public void setTrafficType(String trafficType) {
		this.trafficType = trafficType;
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

	@Override
	public String toString() {
		return "AccidentRemarkBo [id=" + id + ", license=" + license + ", photoList=" + photoList + ", videoList="
				+ videoList + ", remark=" + remark + ", voiceRemark=" + voiceRemark + ", userId=" + userId + ", name="
				+ name + ", phone=" + phone + ", carCardZ=" + carCardZ + ", carCardF=" + carCardF + ", driveCardImgZ="
				+ driveCardImgZ + ", driveCardImgF=" + driveCardImgF + ", voiceResult=" + voiceResult + ", result="
				+ result + ", carId=" + carId + ", insName=" + insName + ", getLicense()=" + getLicense()
				+ ", getRemark()=" + getRemark() + ", getVoiceRemark()=" + getVoiceRemark() + ", getPhotoList()="
				+ getPhotoList() + ", getVideoList()=" + getVideoList() + ", getUserId()=" + getUserId()
				+ ", getName()=" + getName() + ", getPhone()=" + getPhone() + ", getCarCardZ()=" + getCarCardZ()
				+ ", getCarCardF()=" + getCarCardF() + ", getDriveCardImgZ()=" + getDriveCardImgZ()
				+ ", getDriveCardImgF()=" + getDriveCardImgF() + ", getVoiceResult()=" + getVoiceResult()
				+ ", getResult()=" + getResult() + ", getCarId()=" + getCarId() + ", getInsName()=" + getInsName()
				+ ", getId()=" + getId() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

}
