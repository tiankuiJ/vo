package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.PushTrailer;

public interface PushTrailerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(PushTrailer record);


    PushTrailer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(PushTrailer record);
    
    List<PushTrailer> selectList(PushTrailer record);

}