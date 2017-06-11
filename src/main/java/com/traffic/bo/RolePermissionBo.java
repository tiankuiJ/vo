package com.traffic.bo;

import com.traffic.vo.RolePermission;

public class RolePermissionBo extends RolePermission{
	/**
	 * 
	 */
	private static final long serialVersionUID = 9062856649866995080L;
	/**
	 * 资源名称
	 */
	private String name;
	/**
	 * 拥有的权限名称
	 */
	private String permissionsName;
	
	/**
	 * 资源标识
	 */
	private String identity;
	
	private String pMark;
	
	private Boolean checkAdd;
	private Boolean checkEdit;
	private Boolean checkView;
	private Boolean checkReview;
	private Boolean checkDel;
	private Boolean checkAll;

	public Boolean getCheckAdd() {
		return checkAdd;
	}

	public void setCheckAdd(Boolean checkAdd) {
		this.checkAdd = checkAdd;
	}

	public Boolean getCheckEdit() {
		return checkEdit;
	}

	public void setCheckEdit(Boolean checkEdit) {
		this.checkEdit = checkEdit;
	}

	public Boolean getCheckView() {
		return checkView;
	}

	public void setCheckView(Boolean checkView) {
		this.checkView = checkView;
	}

	public Boolean getCheckReview() {
		return checkReview;
	}

	public void setCheckReview(Boolean checkReview) {
		this.checkReview = checkReview;
	}

	public Boolean getCheckDel() {
		return checkDel;
	}

	public void setCheckDel(Boolean checkDel) {
		this.checkDel = checkDel;
	}

	public Boolean getCheckAll() {
		return checkAll;
	}

	public void setCheckAll(Boolean checkAll) {
		this.checkAll = checkAll;
	}

	public String getpMark() {
		return pMark;
	}

	public void setpMark(String pMark) {
		this.pMark = pMark;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getPermissionsName() {
		return permissionsName;
	}

	public void setPermissionsName(String permissionsName) {
		this.permissionsName = permissionsName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
