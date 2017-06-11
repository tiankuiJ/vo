package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.FeedBackBo;
import com.traffic.vo.FeedBack;
import com.traffic.vo.FeedbackWithBLOBs;

public interface FeedBackMapper {
//    int deleteByPrimaryKey(Integer id);

    int insert(FeedbackWithBLOBs record);

    FeedbackWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(FeedbackWithBLOBs record);
    
    List<FeedBack> selectList(FeedBackBo m);

}