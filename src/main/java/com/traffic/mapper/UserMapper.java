package com.traffic.mapper;

import java.util.List;

import com.traffic.bo.PoliceBo;
import com.traffic.bo.UserBo;
import com.traffic.vo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    /**
     * selectByUserNameAndPassWord
     * selectById
     * @param user
     * @return
     */
    UserBo selectUserBo(User user);
    User findByUserName(String userName);
    int changeDeleted(List<Long> ids);
    int deleteRecovery(List<Long> ids);
    /**
     * 员工列表
     * @param m
     * @return
     */
    List<UserBo> getList(UserBo m);
    /**
     * 包含机构名称
     * @param m
     * @return
     */
    List<UserBo> getListByJj(UserBo m);
    /**
     * 安全员列表
     * 用户列表
     * @param m
     * @return
     */
    List<User> getListByType(User m);
    
    User selectType(User user);
    /**
     * 查询保险公司管理员
     * @param insCompanyId
     * @return
     */
    List<User> selectInsCompanyAdmin(Long insCompanyId);
    /**
     * 查看拖车公司管理员
     * @param traId
     * @return
     */
    List<User> selectTraAdmin(Long traId);
    /**
	 * 根据用户名修改密码
	 * @param user
	 * @return
	 */
	int rePassWordByUserName(User user);
	
	/**
	 * 返回  userName passWord
	 * @param keyCode
	 * @return
	 */
	User selectByKeyCode(String keyCode);
	
	
	/**
	 * 根据位置查询交警
	 * @param user
	 * @return
	 */
	List<User> selectPoliceByLocation(User user);
	/**
     * 根据保险公司id查询保险人员
     * @param insCompanyId
     * @return
     */
    List<User> selectByInsCompany(UserBo user);
    /**
     * 根据拖车公司id查询拖车人员
     * @param user
     * @return
     */
    List<User> selectByTraCompany(UserBo user);
	
    /**
     * 将keyCode设为空
     * @param userId
     * @return
     */
    int updateKeyCode(Long userId);
    
    /**
     * 将用户转换为安全与员
     * @param ids
     * @return
     */
    int changeTypeToSecur(List<Long> ids);
    /**
     * 将安全员转换为用户
     * @param ids
     * @return
     */
    int changeTypeToMember(List<Long> ids);
    
    int deleteList(List<Long> list);
    
    //根据机构查询交警
  	List<User> selectPersonByOrg(UserBo userBo);
  	
  	//查询id指定范围内的用户
  	List<User> selectPoliceByIds(User user);
  	
  	
  	List<PoliceBo> selectPoliceBoList();
    
    int addBatch(List<User> list);
}