package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("msg")
public class AccidentMsg {
    private Long id;

    private Long tpId;

    private String status;

    private Date createTime;
    //被推送的次数
    private Integer pushCount;
    
    private Double lon;
    
    private Double lat;
    
    private String handleType;
    //交警队id
    private Long ptId;
    //处理时间
    private Date handleTime;
    //交警建议领取责任书或处理时间
    private Date receviceTime;
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Integer getPushCount() {
		return pushCount;
	}

	public void setPushCount(Integer pushCount) {
		this.pushCount = pushCount;
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

	public String getHandleType() {
		return handleType;
	}

	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}

	public Long getPtId() {
		return ptId;
	}

	public void setPtId(Long ptId) {
		this.ptId = ptId;
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

	@Override
	public String toString() {
		return "AccidentMsg [id=" + id + ", tpId=" + tpId + ", status=" + status + ", createTime=" + createTime
				+ ", pushCount=" + pushCount + ", lon=" + lon + ", lat=" + lat + ", handleType=" + handleType
				+ ", ptId=" + ptId + ", handleTime=" + handleTime + ", receviceTime=" + receviceTime + "]";
	}


	
    
}