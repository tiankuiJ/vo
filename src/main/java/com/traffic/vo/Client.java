package com.traffic.vo;

import org.apache.ibatis.type.Alias;

@Alias("client")
public class Client {
    private Long id;

    private String name;

    private String cardNo;

    private String phone;

    private String trafficType;

    private String license;

    private String policyNumber;
    //事故id
    private Long acId;

    private Integer msgId;
    
    private Boolean isRecive;

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

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTrafficType() {
        return trafficType;
    }

    public void setTrafficType(String trafficType) {
        this.trafficType = trafficType == null ? null : trafficType.trim();
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license == null ? null : license.trim();
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber == null ? null : policyNumber.trim();
    }

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public Long getAcId() {
		return acId;
	}

	public void setAcId(Long acId) {
		this.acId = acId;
	}

	public Boolean getIsRecive() {
		return isRecive;
	}

	public void setIsRecive(Boolean isRecive) {
		this.isRecive = isRecive;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + ", cardNo=" + cardNo + ", phone=" + phone + ", trafficType="
				+ trafficType + ", license=" + license + ", policyNumber=" + policyNumber + ", acId=" + acId
				+ ", msgId=" + msgId + ", isRecive=" + isRecive + "]";
	}

	

   
}