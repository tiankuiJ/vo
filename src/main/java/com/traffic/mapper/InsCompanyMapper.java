package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.InsCompany;

public interface InsCompanyMapper {
    int deleteByPrimaryKey(Long id);

    int insert(InsCompany record);

    InsCompany selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(InsCompany record);
    
    List<InsCompany> getList(InsCompany m);
    int deletedByIds(List<Long> list);
    /**
     * @param name
     * @return id
     */
    InsCompany selectByName(String name);

}