package com.traffic.vo;

import java.io.Serializable;

import com.traffic.bo.Treeable;

public class Resource implements Treeable<Serializable>{
    private Long id;

    private String icon;

    private String name;

    private String identity;

    private Long parentId;

    private String parentIds;

    private String isShow;

    private String url;

    private Integer weight;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity == null ? null : identity.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds == null ? null : parentIds.trim();
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow == null ? null : isShow.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    
    private String pMark;

	public String getpMark() {
		return pMark;
	}

	public void setpMark(String pMark) {
		this.pMark = pMark;
	}

	@Override
	public void setParentId(Serializable parentId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getSeparator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String makeSelfAsNewParentIds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isRoot() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isLeaf() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isHasChildren() {
		// TODO Auto-generated method stub
		return false;
	}
	
}