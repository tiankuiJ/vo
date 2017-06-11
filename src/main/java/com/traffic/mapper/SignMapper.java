package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Sign;

public interface SignMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Sign record);

    Sign selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Sign record);
    
    Sign selectCurrentDayByUser(Long userId);
    List<Sign> selectCurrentMonthByUser(Long userId);

}