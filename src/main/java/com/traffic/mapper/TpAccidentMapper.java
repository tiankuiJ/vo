package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.TpAccident;

public interface TpAccidentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TpAccident record);

    List<TpAccident> selectList(TpAccident record);
    
    TpAccident selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TpAccident record);

}