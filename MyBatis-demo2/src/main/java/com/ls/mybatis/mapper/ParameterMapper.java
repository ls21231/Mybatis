package com.ls.mybatis.mapper;

import com.ls.mybatis.pojo.User;

import java.util.List;
import java.util.Map;

/**
 * @ls
 * @create 2022 -- 07 -- 15
 */
public interface ParameterMapper {

    User checkLoginByMap(Map<String,Object> map);
    /**
     * 验证登录
     */
    User checkLogin(String username,String password);

    /**
     * 根据用户名查询用户信息
     */
    User getUser(String username);


    /**
     * 查询所有员工信息
     * @return UserList
     */
    List<User> getAllUser();
}
