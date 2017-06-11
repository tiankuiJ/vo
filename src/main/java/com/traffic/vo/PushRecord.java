package com.traffic.vo;

import java.util.Date;

import org.apache.ibatis.type.Alias;

/**
 * 事故消息推送记录
 * 公司名称：四川咖菲科技有限公司
 * 联系电话： 13398376166
 * 联系人： 陈德强
 * 邮箱：200751119@qq.com
 * 微信号： mycdq168
 * 地址：四川省绵阳市创新中心二期412
 * 官方网站 : http://www.kafeikeji.com/
 * 微信公众号： 咖啡科技
 * 项目名称：通用商城
 * 类名称：
 * 类描述：   
 * 创建人：田奎
 * 创建时间： 2016年11月7日
 * 修改人：
 * 修改时间：
 * 修改备注：   
 * @version 1.0
 */

@Alias("pushRecord")
public class PushRecord {
    private Long id;
    //事故消息id
    private Long msgId;
    //交警id
    private Long tpId;
    //结果(已处理/未处理)
    private String result;
    //时间
    private Date createTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMsgId() {
        return msgId;
    }

    public void setMsgId(Long msgId) {
        this.msgId = msgId;
    }

    public Long getTpId() {
        return tpId;
    }

    public void setTpId(Long tpId) {
        this.tpId = tpId;
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
}