package com.traffic.mapper;


import java.util.List;

import com.traffic.vo.OpLog;

public interface OpLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(OpLog record);

    OpLog selectByPrimaryKey(Integer id);

    List<OpLog> selectList(OpLog log);

    int deleteBatchById(List<Integer> ids);

}