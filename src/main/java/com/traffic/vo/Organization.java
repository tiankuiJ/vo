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
 * 类名称：机构
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年10月8日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class Organization {
    private Long id;

    private String name;

    private String province;

    private String city;

    private String county;

    private Long pid;
    
    private String tel;
    private String address;
    private String lon;
    private String lat;
    
    /**
     * 中队
     * 派出所
     */
    private String type;
    
    private String workTime;
    
    public String getWorkTime() {
		return workTime;
	}

	public void setWorkTime(String workTime) {
		this.workTime = workTime;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

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

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county == null ? null : county.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

	public Organization(Long id, Long pid) {
		super();
		this.id = id;
		this.pid = pid;
	}
	public Organization() {
		super();
	}

	public Organization(String county, String type) {
		super();
		this.county = county;
		this.type = type;
	}
    
    
}