package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.IncAccident;

public interface IncAccidentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IncAccident record);
    
    List<IncAccident> selectList(IncAccident record);


    IncAccident selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IncAccident record);

}