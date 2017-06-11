package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.IllegalReportBo;
import com.traffic.vo.IllegalReport;

public interface IllegalReportMapper {
    int deleteByPrimaryKey(Long id);

    int insert(IllegalReport record);

    List<IllegalReportBo> selectList(IllegalReport record);
    
    IllegalReportBo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(IllegalReport record);

}