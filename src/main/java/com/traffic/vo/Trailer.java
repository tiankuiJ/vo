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
 * 类名称：拖车
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年11月9日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class Trailer {
    private Long id;

    private String name;

    private String lat;

    private String lon;

    private String address;

    private String price;

    private String tel;

    private String img;

    private String comm;

    private String imgs;
    
    private String[] imgsList;
    
    /**
     * 服务车辆类型  大车、小车..
     */
    private String type;
    /**
     * 评分
     */
    private String star;
    /**
     * 服务次数
     */
    private Integer sNum;
    /**
     * 参与评分人数
     */
    private Integer uNum;
	
    
	public String getStar() {
		return star;
	}

	public void setStar(String star) {
		this.star = star;
	}

	public Integer getsNum() {
		return sNum;
	}

	public void setsNum(Integer sNum) {
		this.sNum = sNum;
	}

	public Integer getuNum() {
		return uNum;
	}

	public void setuNum(Integer uNum) {
		this.uNum = uNum;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getImgsList() {
		return imgsList;
	}

	public void setImgsList(String[] imgsList) {
		this.imgsList = imgsList;
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

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat == null ? null : lat.trim();
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon == null ? null : lon.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img == null ? null : img.trim();
    }

    public String getComm() {
        return comm;
    }

    public void setComm(String comm) {
        this.comm = comm == null ? null : comm.trim();
    }

    public String getImgs() {
        return imgs;
    }

    public void setImgs(String imgs) {
        this.imgs = imgs == null ? null : imgs.trim();
    }
}