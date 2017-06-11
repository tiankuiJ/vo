package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.AccidentBo;
import com.traffic.vo.Accident;
import com.traffic.vo.ConsultIns;

public interface AccidentMapper {
	int deleteByPrimaryKey(Long id);

	int insert(Accident record);

	Accident selectByPrimaryKey(Long id);

	int updateByPrimaryKeySelective(Accident record);

	// 查询当前事故是否已有数据
	List<Accident> selectRepeat(Accident accident);

	// 根据用户查询事故
	List<Accident> selectByUser(Accident accident);

	// 根据事故消息查询事故
	List<Accident> selectByMsgId(Long msgId);

	List<Accident> selectRepeatSelf(Accident accident);

	// 查询未被交警处理的事故
	List<Accident> selectNoHandlePolice();
	
	List<Accident> selectNoHandlePoliceAdmin();

	// 查询未被保险公司处理的事故
	List<Accident> selectNoHandleIns();

	// 查询事故列表
	List<AccidentBo> selectAccidentList(Accident accident);

	List<AccidentBo> selectListNoFinish(Accident accident);

	List<AccidentBo> selectListFinish(Accident accident);

	List<AccidentBo> selectAccidentListByUser(Accident accident);

	List<AccidentBo> selectListNoFinishByUser(Accident accident);

	List<AccidentBo> selectListFinishByUser(Accident accident);

	// 查询未被拖车公司接收的事故信息
	List<Accident> selectNoHandleTrailer();
	//根据保险公司获取事故列表
	List<AccidentBo> selectListByIns(ConsultIns ins);
	//根据安全员查询事故列表
	List<AccidentBo> selectListBySafety(Accident accident);
	
	List<Accident> selectNoHandleIns24();

}