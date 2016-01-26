package com.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * 
 * @author liurh
 * @date   2016年1月25日
 * @intro  创建SqlSession
 *
 */
public class SqlSessionBuild {
	// 设置静态变量sqlSessionFactory
	private static SqlSessionFactory sqlSessionFactory;

	// 获取sqlSessionFactory方法
	public SqlSession getSqlSession() {

		// 构建SqlSessionFactory
		String resource = "mybatis-config.xml";
		InputStream inputStream = null;
		try {
			inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 从 SqlSessionFactory 中获取 SqlSession
		SqlSession sqlSession = sqlSessionFactory.openSession();

		// 返回SqlSession
		return sqlSession;
	}
}
