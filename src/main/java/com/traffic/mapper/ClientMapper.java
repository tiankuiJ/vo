package com.traffic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;

import com.traffic.vo.Client;

public interface ClientMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Client record);


    Client selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Client record);
    int updateByAcIdSelective(Client record);
    @Delete("delete from t_client where msg_id=#{msgId}")
    int deleteByMsgId(Long msgId);
    List<Client> selectList(Client client);

}