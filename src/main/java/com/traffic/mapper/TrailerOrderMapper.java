package com.traffic.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.traffic.bo.ConsultInsBo;
import com.traffic.bo.TrailerOrderListBo;
import com.traffic.vo.TrailerOrder;

public interface TrailerOrderMapper {
    int deleteByPrimaryKey(Long id);


    int insertSelective(TrailerOrder record);

    TrailerOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TrailerOrder record);
    
    List<TrailerOrderListBo> selectList(TrailerOrder record);
    
    List<TrailerOrderListBo> adminList(TrailerOrder record);
    
  //根据拖车公司id查询好评数量
    @Select("select count(id) from t_trailer_order where star>=1 and star<=2 and trailer_id=#{trailerId}")
    int selectBad(TrailerOrder record);
    //根据拖车公司id查询一般数量
    @Select("select count(id) from t_trailer_order where star>2 and star<=3 and trailer_id=#{trailerId}")
    int selectCommonly(TrailerOrder record);
    //根据拖车公司id查询差评数量
    @Select("select count(id) from t_trailer_order where star>3 and star<=5 and trailer_id=#{trailerId}")
    int selectGood(TrailerOrder record);
    
    
    //根据拖车id查询评论列表
    List<TrailerOrder> selectEvaluateList(TrailerOrder record);
    
    List<TrailerOrderListBo> selectListFinisht(TrailerOrder record);
    
    List<TrailerOrderListBo> selectTrailer(TrailerOrder record);
    
//    List<TrailerOrderListBo> selectTrailerFinish(TrailerOrder record);
    
    List<ConsultInsBo> selectHandleList(Long msgId);
}