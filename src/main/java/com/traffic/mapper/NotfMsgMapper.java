package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.NotfMsg;

public interface NotfMsgMapper {
    int deleteByBatch(List<Long> ids);

    int insert(NotfMsg record);

    NotfMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(NotfMsg record);
    
    List<NotfMsg> selectList(NotfMsg m);
}