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
 * 类名称：签到
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年10月10日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class Sign {
    private Long id;

    private Long userId;

    private String address;

    private String longitude;

    private String latitude;

    /**
     * 当前经度
     */
    private String currLongitude;

    /**
     * 当前纬度
     */
    private String currLatitude;
    
    private Date createDate;

    public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude == null ? null : latitude.trim();
    }

    public String getCurrLongitude() {
        return currLongitude;
    }

    public void setCurrLongitude(String currLongitude) {
        this.currLongitude = currLongitude == null ? null : currLongitude.trim();
    }

    public String getCurrLatitude() {
        return currLatitude;
    }

    public void setCurrLatitude(String currLatitude) {
        this.currLatitude = currLatitude == null ? null : currLatitude.trim();
    }
}