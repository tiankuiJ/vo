package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Trailer;

public interface TrailerMapper {
    int deleteByBatch(List<Long> ids);

    int insert(Trailer record);

    Trailer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Trailer record);
    
    List<Trailer> getList(Trailer m);

}