package com.traffic.mapper;

import java.util.List;

import com.traffic.vo.Resource;

public interface ResourceMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Resource record);

    Resource selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Resource record);
    
    /**
     * 不查询父标识
     * 编辑资源时调用
     * @return
     */
    List<Resource> getAll();
    /**
     * 包含父标识
     * 登录成功后调用
     * @return
     */
    List<Resource> getAllResource();
    List<Resource> selectByRole(Long roleId);
    
}