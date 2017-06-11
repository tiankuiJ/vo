package com.traffic.bo;

import java.util.List;

import com.traffic.vo.User;

public class UserBo extends User{
	private Long roleId;
	private String roleMark;
	private String roleName;
	//组织/保险公司/拖车公司Id
	private Long orgInsId;
	private String orgInsName;
	/**
	 * 中队/派出所
	 */
	private String orgType;
	
	private String province;
	private String city;
	private String county;
	//
	private List<Long> notIds;
	private List<Long> orgIds;
	
	public List<Long> getOrgIds() {
		return orgIds;
	}
	public void setOrgIds(List<Long> orgIds) {
		this.orgIds = orgIds;
	}
	public String getOrgType() {
		return orgType;
	}
	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Long getOrgInsId() {
		return orgInsId;
	}
	public void setOrgInsId(Long orgInsId) {
		this.orgInsId = orgInsId;
	}
	public String getOrgInsName() {
		return orgInsName;
	}
	public void setOrgInsName(String orgInsName) {
		this.orgInsName = orgInsName;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleMark() {
		return roleMark;
	}
	public void setRoleMark(String roleMark) {
		this.roleMark = roleMark;
	}
	public List<Long> getNotIds() {
		return notIds;
	}
	public void setNotIds(List<Long> notIds) {
		this.notIds = notIds;
	}
	
	
}
