package com.traffic.mapper;

import com.traffic.vo.Agreement;

public interface AgreementMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Agreement record);


    Agreement selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Agreement record);

    int updateByPrimaryKeyWithBLOBs(Agreement record);

}