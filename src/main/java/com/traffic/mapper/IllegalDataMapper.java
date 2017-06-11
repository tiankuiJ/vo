package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.IllegalData;

public interface IllegalDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IllegalData record);


    IllegalData selectByPrimaryKey(Long id);
    
    List<IllegalData> selectList(IllegalData record);

    int updateByPrimaryKeySelective(IllegalData record);

}