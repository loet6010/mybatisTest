package com.mybatis.logic;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.dto.User;

public class Test1 {
	
	public static void main(String[] args) throws IOException {
        //mybatis的配置文件
        String resource = "conf.xml";
        
        //使用类加载器加载mybatis的配置文件（它也加载关联的映射文件）
        InputStream is = Test1.class.getClassLoader().getResourceAsStream(resource);
        
        //构建sqlSession的工厂
        SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(is);

        //创建能执行映射文件中sql的sqlSession
        SqlSession session = sessionFactory.openSession();
        
        //映射sql的标识字符串
        String statement = "com.mybatis.userMapper.getUser";
        
        //执行查询返回一个唯一user对象的sql
        List<User> userList = session.selectList(statement);
        
        for(User user: userList) {
            System.out.println(user.getName());
        }
        
        User user = new User();
        user.setAge(55);
        user.setId(2);
        
      //映射sql的标识字符串
        String statement1 = "com.mybatis.userMapper.updateUser";
        int a = session.update(statement1, user);
        System.out.println("a:"+a);
        session.commit();
    }
}
