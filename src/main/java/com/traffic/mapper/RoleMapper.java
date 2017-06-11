package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Role record);

    Role selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Role record);

    List<Role> getList(Role m);
    /**
     * 获取各个管理员id
     * @param type
     * @return
     */
    Long getAdminId(String type);
    
    List<Long> getByTrailerIds(List<Long> tIds);
    int deleteByTrailerIds(List<Long> tIds);
}