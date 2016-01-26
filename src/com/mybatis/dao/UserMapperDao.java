package com.mybatis.dao;

import com.mybatis.dto.User;

public interface UserMapperDao {

	/**
	 * 根据用户ID来查找用户，返回用户模型
	 */
	public User selectUser(int userId);

}
