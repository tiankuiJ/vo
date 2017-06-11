package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.AppVersion;

public interface AppVersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppVersion record);


    AppVersion selectByPrimaryKey(Integer id);
    
    
    List<AppVersion> selectList(AppVersion version);
    
    AppVersion selectNew(AppVersion record);

    int updateByPrimaryKeySelective(AppVersion record);

}