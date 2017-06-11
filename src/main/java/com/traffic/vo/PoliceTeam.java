package com.traffic.vo;

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
 * 类名称：交警队
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年11月11日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class PoliceTeam {
    private Long id;

    private String name;

    private String address;

    private String tel;
    
    /**
     * 经度
     */
    private String lon;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 工作时间
     */
    private String workTime;
    
    public String getLon() {
		return lon;
	}

	public void setLon(String lon) {
		this.lon = lon;
	}

	public String getLat() {
		return lat;
	}

	public void setLat(String lat) {
		this.lat = lat;
	}

	public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}