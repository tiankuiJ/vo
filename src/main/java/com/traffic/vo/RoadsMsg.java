package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("roadsMsg")
public class RoadsMsg {
    private Long id;
    //语音地址
    private String voiceUrl;
    //经度
    private Double lon;
    //纬度
    private Double lat;
    //中心点地址
    private String address;
    //结束日期
    private Date endTime;
    //开始日期
    private Date createTime;
    //是否是全范围收听(0不是全范围/1是全范围)
    private Integer allRange;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoiceUrl() {
        return voiceUrl;
    }

    public void setVoiceUrl(String voiceUrl) {
        this.voiceUrl = voiceUrl == null ? null : voiceUrl.trim();
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

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Integer getAllRange() {
		return allRange;
	}

	public void setAllRange(Integer allRange) {
		this.allRange = allRange;
	}

	

	
	
    
}