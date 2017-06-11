package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.SysConfig;

public interface SysConfigMapper {
    SysConfig selectByPrimaryKey(Integer id);
    int updateByPrimaryKeySelective(SysConfig record);
    SysConfig selectByKey(String k);
    List<SysConfig> getList();
}