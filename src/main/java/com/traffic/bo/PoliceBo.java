package com.traffic.bo;

import org.apache.ibatis.type.Alias;

@Alias("policeBo")
public class PoliceBo {
	
	private Long id;
	
	private String name;
	
	private String phone;
	
	private String orgName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	
	

}
