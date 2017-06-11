package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.TpData;

public interface TpDataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TpData record);


    TpData selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TpData record);
    
    List<TpData> selectList(TpData tpData);

}