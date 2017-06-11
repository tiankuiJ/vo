package com.traffic.vo;

import java.util.Date;

/**
 * 公司名称：四川咖菲科技有限公司
 * 联系电话： 13398376166
 * 联系人： 陈德强
 * 邮箱：200751119@qq.com
 * 微信号： mycdq168
 * 地址：四川省绵阳市创新中心二期412
 * 官方网站 : http://www.kafeikeji.com/
 * 微信公众号： 咖啡科技
 * 项目名称：掌上交警
 * 类名称：用户
 * 类描述：  
 * 创建人：蒋莲
 * 创建时间： 2016年10月10日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class User {
    private Long id;
    private String userName;
    private String passWord;
    /**
     * 真实姓名
     */
    private String name;
    /**
     * 0男
     * 1女
     */
    private String sex;
    /**
     * 生日 
     */
    private Date birthDay;
    /**
     * 身份证号
     */
    private String idNumber;
    /**
     * 驾照类型
     */
    private String driverLicense;
    /**
     * 驾照领取时间
     */
    private Date licenseDate;
    /**
     * 地址
     */
    private String address;
    private String email;
    /**
     * 昵称 /联系电话
     */
    private String nickName;
    /**
     * 头像
     */
    private String headImg;
    /**
     * 管理员/用户/交警/保险公司/拖车公司/安全员
     */
    private String type;
    /**
     * 0未删除  / 1已删除
     */
    private String deleted;
    /**
     * 驾照正面照片
     */
    private String licenseImgsFront;
    /**
     *  驾照反面照片
     */
    private String licenseImgsBack;
    /**
     * 登录校验码
     */
    private String keyCode;
    /**
     * 经度
     */
    private String latitude;
    /**
     * 纬度
     */
    private String longitude;
    /**
     *  执勤中/休息中
     */
    private String status;
    
    /**
     * 当前位置
     */
    private String currentLocation;
    
    /**
     * 搜索字段 
     */
    private String searchStr;
    
    public String getSearchStr() {
		return searchStr;
	}

	public void setSearchStr(String searchStr) {
		this.searchStr = searchStr;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getKeyCode() {
		return keyCode;
	}

	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}

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
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber == null ? null : idNumber.trim();
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense == null ? null : driverLicense.trim();
    }

    public Date getLicenseDate() {
        return licenseDate;
    }

    public void setLicenseDate(Date licenseDate) {
        this.licenseDate = licenseDate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getHeadImg() {
        return headImg;
    }

    public void setHeadImg(String headImg) {
        this.headImg = headImg == null ? null : headImg.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

	public String getLicenseImgsFront() {
		return licenseImgsFront;
	}

	public void setLicenseImgsFront(String licenseImgsFront) {
		this.licenseImgsFront = licenseImgsFront;
	}

	public String getLicenseImgsBack() {
		return licenseImgsBack;
	}

	public void setLicenseImgsBack(String licenseImgsBack) {
		this.licenseImgsBack = licenseImgsBack;
	}

	public User(String userName, String passWord) {
		super();
		this.userName = userName;
		this.passWord = passWord;
	}
	public User() {
		super();
	}
	
	public User(Long id){
		super();
		this.id=id;
	}
    
	public User(Long id, String keyCode) {
		super();
		this.id = id;
		this.keyCode = keyCode;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", passWord=" + passWord + ", name=" + name + ", sex="
				+ sex + ", birthDay=" + birthDay + ", idNumber=" + idNumber + ", driverLicense=" + driverLicense
				+ ", licenseDate=" + licenseDate + ", address=" + address + ", email=" + email + ", nickName="
				+ nickName + ", headImg=" + headImg + ", type=" + type + ", deleted=" + deleted + ", licenseImgsFront="
				+ licenseImgsFront + ", licenseImgsBack=" + licenseImgsBack + ", keyCode=" + keyCode + ", latitude="
				+ latitude + ", longitude=" + longitude + ", status=" + status + ", currentLocation=" + currentLocation
				+ ", searchStr=" + searchStr + "]";
	}
	
}