package com.traffic.vo;

import java.util.Date;

public class PushTrailer {
    private Long id;

    private Long acId;

    private Long trailerId;

    private Date createDate;

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

    public Long getTrailerId() {
        return trailerId;
    }

    public void setTrailerId(Long trailerId) {
        this.trailerId = trailerId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

	@Override
	public String toString() {
		return "PushTrailer [id=" + id + ", acId=" + acId + ", trailerId=" + trailerId + ", createDate=" + createDate
				+ "]";
	}
    
}