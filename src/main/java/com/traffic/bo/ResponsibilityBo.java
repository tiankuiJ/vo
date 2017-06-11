package com.traffic.bo;

import java.util.List;

import org.apache.ibatis.type.Alias;

import com.traffic.vo.Client;
import com.traffic.vo.Responsibility;

@Alias("responsibilityBo")
public class ResponsibilityBo extends Responsibility{
	// 当事人
	private List<Client> clients;
	//事故状态
	private String status;
	
	private String tpName;
	
	private boolean safety;

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	@Override
	public String toString() {
		return "ResponsibilityBo [clients=" + clients + "]";
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTpName() {
		return tpName;
	}

	public void setTpName(String tpName) {
		this.tpName = tpName;
	}

	public boolean isSafety() {
		return safety;
	}

	public void setSafety(boolean safety) {
		this.safety = safety;
	}

	

}
