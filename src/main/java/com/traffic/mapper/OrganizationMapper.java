package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Organization;

public interface OrganizationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Organization record);

    Organization selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Organization record);
    
    List<Organization> getList(Organization m);

}