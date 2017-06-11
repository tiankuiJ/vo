package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Auth;

public interface AuthMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Auth record);

    Auth selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Auth record);
    int updateByUser(Auth m);
    
    Auth selectByUserId(Long id);
    
    int deleteByRoleIds(List<Long> rIds);
    int deleteByTrailerIds(List<Long> list);
    List<Long> selectUserIdsByTrailerIds(List<Long> ids);
    
    int addBatch(List<Auth> list);
}