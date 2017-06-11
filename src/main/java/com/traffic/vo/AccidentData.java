package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("accidentData")
public class AccidentData {
    private Long id;

    private Long acId;
    
    private Long msgId;

    private Long userId;

    private String mediaUrl;

    private String mediaType;

    private String photoType;

    private Date createTime;

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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl == null ? null : mediaUrl.trim();
    }

    public String getMediaType() {
        return mediaType;
    }

    public void setMediaType(String mediaType) {
        this.mediaType = mediaType == null ? null : mediaType.trim();
    }

    public String getPhotoType() {
        return photoType;
    }

    public void setPhotoType(String photoType) {
        this.photoType = photoType == null ? null : photoType.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Long getMsgId() {
		return msgId;
	}

	public void setMsgId(Long msgId) {
		this.msgId = msgId;
	}

	@Override
	public String toString() {
		return "AccidentData [id=" + id + ", acId=" + acId + ", userId=" + userId + ", mediaUrl=" + mediaUrl
				+ ", mediaType=" + mediaType + ", photoType=" + photoType + ", createTime=" + createTime + "]";
	}
    
}