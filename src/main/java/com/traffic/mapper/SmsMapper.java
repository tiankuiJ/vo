package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Sms;

public interface SmsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Sms record);

    Sms selectByPrimaryKey(Integer id);

    List<Sms> selectList(Sms m);
}