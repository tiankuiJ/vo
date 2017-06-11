package com.traffic.vo;

import java.util.Date;

/**
 * 公司名称：四川咖菲科技有限公司
 * 联系电话： 13398376166
 * 联系人： 陈德强
 * 邮箱：200751119@qq.com
 * 微信号： mycdq168
 * 地址：四川省绵阳市创新中心二期412
 * 官方网站 : http://www.kafeikeji.com/
 * 微信公众号： 咖啡科技
 * 项目名称：掌上交警
 * 类名称：短信发送记录
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年11月28日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class Sms {
    private Integer id;

    private String phone;

    private String content;

    private String result;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result == null ? null : result.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public Sms(String phone, String content, String result) {
		super();
		this.phone = phone;
		this.content = content;
		this.result = result;
	}

	public Sms() {
		super();
	}
    
    
}