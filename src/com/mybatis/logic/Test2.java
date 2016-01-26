package com.mybatis.logic;

import org.apache.ibatis.session.SqlSession;

import com.mybatis.dao.UserMapperDao;
import com.mybatis.dto.User;
import com.mybatis.util.SqlSessionBuild;

/**
 * 
 * @author liurh
 * @date   2016年1月25日
 * @intro  mybatis测试
 *
 */
public class Test2 {

	public static void main(String[] args) {

		// 获取SqlSession
		SqlSession sqlSession = new SqlSessionBuild().getSqlSession();
		try {
			// 映射UserMapperDao的selectUser方法，获取用户模型
			UserMapperDao userMapperDao = sqlSession.getMapper(UserMapperDao.class);
			User user = userMapperDao.selectUser(2);
			
			System.out.println(user.getName());
			System.out.println(user.getAge());
		} finally {
			// 关闭SqlSession
			sqlSession.close();
		}
		
		

	}

}
