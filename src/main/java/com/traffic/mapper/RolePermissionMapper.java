package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.RolePermissionBo;
import com.traffic.vo.RolePermission;

public interface RolePermissionMapper {
    RolePermission selectByPrimaryKey(Long id);

    int deleteBatch(List<Long> ids);
    int insertBatch(List<RolePermission> list);
    int updateBatch(List<RolePermission> list);
    
   	int deleteByRole(Long roleId);
   	
   	/**
   	 * 包含父标识
   	 * 登录成功后调用
   	 * @param role
   	 * @return
   	 */
   	List<RolePermissionBo> selectByRole(Long role);
   	/**
   	 * 不查询父标识
   	 * 编辑权限时调用
   	 * @param role
   	 * @return
   	 */
   	List<RolePermissionBo> selectByRoleWithNp(Long role);
   	List<RolePermissionBo> selectByIds(String[] ids);
   	
   	int deleteByRoleIds(List<Long> rIds);

}	