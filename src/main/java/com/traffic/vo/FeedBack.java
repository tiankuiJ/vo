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
 * 类名称：反馈
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年12月9日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class FeedBack {
    private Integer id;

    private String tel;

    private Long userId;

    private Long replyUserId;

    /**
     * 已处理
     * 未处理
     */
    private String status;

    private Date createTime;
    private Date replyTime;
    /**
     * 匿名
     * 1是/0否
     */
    private  String isAym;

    public String getIsAym() {
		return isAym;
	}

	public void setIsAym(String isAym) {
		this.isAym = isAym;
	}

	public Date getReplyTime() {
		return replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getReplyUserId() {
        return replyUserId;
    }

    public void setReplyUserId(Long replyUserId) {
        this.replyUserId = replyUserId;
    }

    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

	public FeedBack(Long userId) {
		super();
		this.userId = userId;
	}
    
	public FeedBack() {
		super();
	}
}