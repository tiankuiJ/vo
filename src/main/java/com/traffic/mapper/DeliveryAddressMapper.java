package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.DeliveryAddress;

public interface DeliveryAddressMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DeliveryAddress record);

    DeliveryAddress selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeliveryAddress record);
    
    /**
     * 查询某个用户默认地址  
     * isDefault=1
     * 查询用户地址列表
     * @param m 
     * @return
     */
    List<DeliveryAddress> getList(DeliveryAddress m);
    int cancelDefault(Long userId);
    
    
    

}