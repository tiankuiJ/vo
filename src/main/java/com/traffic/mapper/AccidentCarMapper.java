package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Accident;
import com.traffic.vo.AccidentCar;

public interface AccidentCarMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AccidentCar record);


    AccidentCar selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(AccidentCar record);
    
    //根据事故id集合查询所有事故的涉案车辆
    List<AccidentCar> selectByAccident(Accident accidentIds);
    //根据事故id查询该事故涉案车辆
    List<AccidentCar> selectByAccidentId(Long accidentId);
    
    //根据事故消息id查询对应事故涉案车辆
    List<AccidentCar> selectByMsgId(Long msgId);
    

}