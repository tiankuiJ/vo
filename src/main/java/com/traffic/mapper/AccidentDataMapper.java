package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.AccidentData;

public interface AccidentDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccidentData record);


    AccidentData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccidentData record);
    //根据事故消息查询事故资料
    List<AccidentData> selectByMsg(Long msgId);
    
    
    //根据事故查询事故资料
    List<AccidentData> selectByAccident(AccidentData data);

}