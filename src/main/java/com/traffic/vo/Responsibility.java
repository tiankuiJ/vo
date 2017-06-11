package com.traffic.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class Responsibility {
    private Long id;

    private Long msgId;
    
    private Long tpId;

    private Date createTime;
    
    private String accidentRemark;

    private String accidentResult;
    
    private String address;
    private Date time;
    
    private String weather;
    
    private String number;
    
    private String searchKey;
    
    private String wordUrl;
    //没有印章的html
    private String htmlUrl;
    //有印章的html
    private String sealHtmlUrl;
    
    //交警队id
    private Long ptId;
    //交警建议领取责任书或处理时间
    private Date receviceTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public String getAccidentRemark() {
		return accidentRemark;
	}

	public void setAccidentRemark(String accidentRemark) {
		this.accidentRemark = accidentRemark;
	}

	public String getAccidentResult() {
		return accidentResult;
	}

	public void setAccidentResult(String accidentResult) {
		this.accidentResult = accidentResult;
	}

	public Long getTpId() {
		return tpId;
	}

	public void setTpId(Long tpId) {
		this.tpId = tpId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getTime() {
		return time;
	}

	public void setTime(Date time) {
		this.time = time;
	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}

	public String getWordUrl() {
		return wordUrl;
	}

	public void setWordUrl(String wordUrl) {
		this.wordUrl = wordUrl;
	}

	public String getHtmlUrl() {
		return htmlUrl;
	}

	public void setHtmlUrl(String htmlUrl) {
		this.htmlUrl = htmlUrl;
	}

	public Long getPtId() {
		return ptId;
	}

	public void setPtId(Long ptId) {
		this.ptId = ptId;
	}

	public Date getReceviceTime() {
		return receviceTime;
	}

	public void setReceviceTime(Date receviceTime) {
		this.receviceTime = receviceTime;
	}
	

	public String getSealHtmlUrl() {
		return sealHtmlUrl;
	}

	public void setSealHtmlUrl(String sealHtmlUrl) {
		this.sealHtmlUrl = sealHtmlUrl;
	}

	@Override
	public String toString() {
		return "Responsibility [id=" + id + ", msgId=" + msgId + ", tpId=" + tpId + ", createTime=" + createTime
				+ ", accidentRemark=" + accidentRemark + ", accidentResult=" + accidentResult + ", address=" + address
				+ ", time=" + time + ", weather=" + weather + ", number=" + number + ", searchKey=" + searchKey
				+ ", wordUrl=" + wordUrl + ", htmlUrl=" + htmlUrl + ", ptId=" + ptId + ", receviceTime=" + receviceTime
				+ "]";
	}

	
    
    
}