package com.traffic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Update;

import com.traffic.vo.AccidentMsg;

public interface AccidentMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccidentMsg record);


    AccidentMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccidentMsg record);
    
    List<AccidentMsg> selectList();
    //单独更新事故被推送的次数
    @Update("update t_accident_msg set push_count=(push_count+1) where id=#{msgId}")
    int updatePushCount(Long msgId);

}