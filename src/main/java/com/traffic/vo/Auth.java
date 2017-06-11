package com.traffic.vo;

public class Auth {
    private Long id;

    private Long userId;

    private Long roleId;
    
    private Long orgInsId;

    public Long getOrgInsId() {
		return orgInsId;
	}

	public void setOrgInsId(Long orgInsId) {
		this.orgInsId = orgInsId;
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

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

	public Auth(Long userId, Long roleId,Long orgInsId) {
		super();
		this.userId = userId;
		this.roleId = roleId;
		this.orgInsId = orgInsId;
	}
	public Auth(Long roleId,Long orgInsId) {
		super();
		this.roleId = roleId;
		this.orgInsId = orgInsId;
	}
    
	public Auth() {
		super();
	}
}