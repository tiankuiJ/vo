package com.traffic.vo;

import java.util.Date;

public class TrailerOrder {
    private Long id;

    private Long trailerId;

    private Long acId;

    private Long userId;

    private String status;

    private Date createDate;

    private String evaluate;

    private Double star;
    
    private Date evaluateDate;
    
    private String userNick;
    
    private String userHead;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTrailerId() {
        return trailerId;
    }

    public void setTrailerId(Long trailerId) {
        this.trailerId = trailerId;
    }

    public Long getAcId() {
        return acId;
    }

    public void setAcId(Long acId) {
        this.acId = acId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEvaluate() {
        return evaluate;
    }

    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate == null ? null : evaluate.trim();
    }

    public Double getStar() {
        return star;
    }

    public void setStar(Double star) {
        this.star = star;
    }

	public Date getEvaluateDate() {
		return evaluateDate;
	}

	public void setEvaluateDate(Date evaluateDate) {
		this.evaluateDate = evaluateDate;
	}

	public String getUserNick() {
		return userNick;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}

	public String getUserHead() {
		return userHead;
	}

	public void setUserHead(String userHead) {
		this.userHead = userHead;
	}

	@Override
	public String toString() {
		return "TrailerOrder [id=" + id + ", trailerId=" + trailerId + ", acId=" + acId + ", userId=" + userId
				+ ", status=" + status + ", createDate=" + createDate + ", evaluate=" + evaluate + ", star=" + star
				+ ", evaluateDate=" + evaluateDate + ", userNick=" + userNick + ", userHead=" + userHead + "]";
	}
    
}