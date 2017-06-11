package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Ad;

public interface AdMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Ad record);

    Ad selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Ad record);
    
    List<Ad> selectList(Ad ad);
    
    int deleteBatch(List<Long> list);
}