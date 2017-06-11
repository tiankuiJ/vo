package com.traffic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.traffic.bo.ConsultInsBo;
import com.traffic.vo.ConsultIns;

public interface ConsultInsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(ConsultIns record);


    ConsultIns selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ConsultIns record);
    
    List<ConsultIns> selectList(ConsultIns record);
    
    List<ConsultInsBo> selectHandleList(Long msgId);
    
    //查询协商处理事故保险公司15分钟内未处理的
    List<ConsultIns> selectNoHandleIns15();
    
    //查询协商处理事故保险公司24小时内未处理的
    List<ConsultIns> selectNoHandleIns24();
}