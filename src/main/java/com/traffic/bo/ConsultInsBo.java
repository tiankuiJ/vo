package com.traffic.bo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

@Alias("consultInsBo")
public class ConsultInsBo {
	private String name;
	
	private String phone;
	
	private String insName;
	
	private Date handleTime;



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

	public Date getHandleTime() {
		return handleTime;
	}

	public void setHandleTime(Date handleTime) {
		this.handleTime = handleTime;
	}

	public String getInsName() {
		return insName;
	}

	public void setInsName(String insName) {
		this.insName = insName;
	}
	
	
	
	
}
