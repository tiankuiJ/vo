package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.RoadsMsg;

public interface RoadsMsgMapper {
    int deleteByPrimaryKey(Long id);
    int deleteBatch(List<Long> ids);
    int insert(RoadsMsg record);


    RoadsMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RoadsMsg record);
    
    
    List<RoadsMsg> selectList(RoadsMsg msg);

}