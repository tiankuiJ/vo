package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.ResponsibilityBo;
import com.traffic.vo.Responsibility;

public interface ResponsibilityMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Responsibility record);


    Responsibility selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Responsibility record);
    
    
    List<ResponsibilityBo> selectList(Responsibility re);
    
    Responsibility selectLastRecord();

}