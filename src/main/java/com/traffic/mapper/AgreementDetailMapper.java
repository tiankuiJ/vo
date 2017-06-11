package com.traffic.mapper;

import com.traffic.vo.AgreementDetail;

public interface AgreementDetailMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AgreementDetail record);


    AgreementDetail selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AgreementDetail record);

}