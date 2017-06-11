package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("consultIns")
public class ConsultIns {
    private Long id;

    private Long acId;

    private Long msgId;
    
    private Long insId;

    private String result;

    private Date createDate;
    //受理时间
    private Date handleTime;
    
    //是否已经通知车主可离开现场
    private Integer isNotice;
    
    private Long safetyId;
    
    private String phone;
    
    private Long insUserId;//保险公司处理人id
    
    private Long tpId;//指定的交警id

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

	public Long getInsId() {
		return insId;
	}

	public void setInsId(Long insId) {
		this.insId = insId;
	}

	@Override
	public String toString() {
		return "ConsultIns [id=" + id + ", acId=" + acId + ", msgId=" + msgId + ", insId=" + insId + ", result="
				+ result + ", createDate=" + createDate + "]";
	}

	public Integer getIsNotice() {
		return isNotice;
	}

	public void setIsNotice(Integer isNotice) {
		this.isNotice = isNotice;
	}

	public Long getSafetyId() {
		return safetyId;
	}

	public void setSafetyId(Long safetyId) {
		this.safetyId = safetyId;
	}

	public Date getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Long getInsUserId() {
		return insUserId;
	}

	public void setInsUserId(Long insUserId) {
		this.insUserId = insUserId;
	}

//	public Long getTpId() {
//		return tpId;
//	}
//
//	public void setTpId(Long tpId) {
//		this.tpId = tpId;
//	}
    
    
}