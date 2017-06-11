package com.traffic.bo;

import com.traffic.vo.FeedbackWithBLOBs;

public class FeedBackBo extends FeedbackWithBLOBs{
	/**
	 * 反馈人 电话(账号)
	 */
	private String userTel;
	/**
	 * 反馈人 姓名
	 */
	private String userRealName;
	public String getUserTel() {
		return userTel;
	}
	public void setUserTel(String userTel) {
		this.userTel = userTel;
	}
	public String getUserRealName() {
		return userRealName;
	}
	public void setUserRealName(String userRealName) {
		this.userRealName = userRealName;
	}
	
	
}
