package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;



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
 * 类名称：用户车辆
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年10月10日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
@Alias("cars")
public class Cars {
    private Long id;

    private Long userId;

    /**
     * 车牌号
     */
    private String carNo;

    /**
     * 车辆类型
     * 大/小车
     */
    private String type;

    private String city;

    /**
     * 车型、型号
     */
    private String models;

    /**
     * 发动机号
     */
    private String engineNo;

    /**
     * 车架号
     */
    private String frameNo;

    /**
     * 行驶证号
     */
    private String drivingNo;

    /**
     * 上户时间
     */
    private Date onDate;

    /**
     * 投保公司Id
     */
    private Long insCompanyId;
    /**
     * 投保公司名称
     */
    private String insCompanyName;

    /**
     * 是否默认 
     * 0否 
     * 1是	
     */
    private String isDefault;
    
    /**
     * 保单号
     */
    private String policyNumber;
    /**
     * 保单图片
     */
    private String policyImg;
    /**
     * 行驶证正面照
     */
    private String cardImgZ;
    /**
     * 行驶证反面照
     */
    private String cardImgF;
    
    private String deleted;
    
    private String owner;
    
    public String getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(String policyNumber) {
		this.policyNumber = policyNumber;
	}

	public String getPolicyImg() {
		return policyImg==null?"":policyImg;
	}

	public void setPolicyImg(String policyImg) {
		this.policyImg = policyImg;
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

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getModels() {
        return models;
    }

    public void setModels(String models) {
        this.models = models == null ? null : models.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getFrameNo() {
        return frameNo;
    }

    public void setFrameNo(String frameNo) {
        this.frameNo = frameNo == null ? null : frameNo.trim();
    }

    public String getDrivingNo() {
        return drivingNo;
    }

    public void setDrivingNo(String drivingNo) {
        this.drivingNo = drivingNo == null ? null : drivingNo.trim();
    }

    public Date getOnDate() {
    	
        return onDate;
    }

    public void setOnDate(Date onDate) {
        this.onDate = onDate;
    }

    public Long getInsCompanyId() {
        return insCompanyId;
    }

    public void setInsCompanyId(Long insCompanyId) {
        this.insCompanyId = insCompanyId;
    }

    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault == null ? null : isDefault.trim();
    }

	public String getInsCompanyName() {
		return insCompanyName;
	}

	public void setInsCompanyName(String insCompanyName) {
		this.insCompanyName = insCompanyName;
	}

	public String getCardImgZ() {
		return cardImgZ;
	}

	public void setCardImgZ(String cardImgZ) {
		this.cardImgZ = cardImgZ;
	}

	public String getCardImgF() {
		return cardImgF;
	}

	public void setCardImgF(String cardImgF) {
		this.cardImgF = cardImgF;
	}

	public String getDeleted() {
		return deleted;
	}

	public void setDeleted(String deleted) {
		this.deleted = deleted;
	}

	

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return "Cars [id=" + id + ", userId=" + userId + ", carNo=" + carNo + ", type=" + type + ", city=" + city
				+ ", models=" + models + ", engineNo=" + engineNo + ", frameNo=" + frameNo + ", drivingNo=" + drivingNo
				+ ", onDate=" + onDate + ", insCompanyId=" + insCompanyId + ", insCompanyName=" + insCompanyName
				+ ", isDefault=" + isDefault + ", policyNumber=" + policyNumber + ", policyImg=" + policyImg
				+ ", cardImgZ=" + cardImgZ + ", cardImgF=" + cardImgF + "]";
	}
    
}