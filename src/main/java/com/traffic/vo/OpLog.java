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
 * 类名称：操作日志
 * 类描述：   
 * 创建人：蒋莲
 * 创建时间： 2016年11月28日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0   
 */
public class OpLog {
    private Integer id;

    private Long userId;

    private String userName;

    private String operationClass;

    private String operationMethod;

    private String operation;

    private String content;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getOperationClass() {
        return operationClass;
    }

    public void setOperationClass(String operationClass) {
        this.operationClass = operationClass == null ? null : operationClass.trim();
    }

    public String getOperationMethod() {
        return operationMethod;
    }

    public void setOperationMethod(String operationMethod) {
        this.operationMethod = operationMethod == null ? null : operationMethod.trim();
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation == null ? null : operation.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}