package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.CarsInfoBo;
import com.traffic.vo.Cars;

public interface CarsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Cars record);

    Cars selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Cars record);
    
    List<Cars> selectByUser(Cars cars);
    
    int deleteByUserAndCarNo(Cars cars);
    
    CarsInfoBo seeCarInfoBo(Long carId);
    
    int cancelDefault(Long userId);
}