package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.PushRecord;

public interface PushRecordMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PushRecord record);


    PushRecord selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PushRecord record);
    
    List<PushRecord> selectList(PushRecord record);

}