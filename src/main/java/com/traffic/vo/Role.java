package com.traffic.vo;

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
 * 类名称：角色
 * 类描述：   default{admin超级管理员 orgAdmin机构管理员 insAdmin保险公司管理员}
 * 创建人：蒋莲
 * 创建时间： 2016年10月10日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class Role {
    private Long id;

    private String name;

    private Long pid;

    private Long orgInsId;

    /**
     * 管理员
     * 交警 
     * 保险公司
     * 拖车公司
     */
    private String type;
    private String mark;

    public String getMark() {
		return mark;
	}

	public void setMark(String mark) {
		this.mark = mark;
	}

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
        this.name = name == null ? null : name.trim();
    }

    public Long getPid() {
        return pid;
    }

    public void setPid(Long pid) {
        this.pid = pid;
    }

    public Long getOrgInsId() {
        return orgInsId;
    }

    public void setOrgInsId(Long orgInsId) {
        this.orgInsId = orgInsId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

	public Role(Long id, Long pid) {
		super();
		this.id = id;
		this.pid = pid;
	}
    
	public Role() {
		super();
	}
    
    
}