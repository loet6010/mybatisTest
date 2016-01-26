package com.mybatis.dto;

/**
 * 
 * @author liurh
 * @date   2016年1月25日
 * @intro  用户模型类
 *
 */
public class User {

    // 用户属性
    private int id;
    private String username;
    private int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return username;
    }

    public void setName(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
