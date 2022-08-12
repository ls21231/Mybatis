package com.ls.mybatis.test;

import com.ls.mybatis.mapper.ParameterMapper;
import com.ls.mybatis.pojo.User;
import com.ls.mybatis.utils.SqlSessionUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ls
 * @create 2022 -- 07 -- 15
 */
public class ParameterMapperTest {
    @Test
    public void testAllUser() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        List<User> list = mapper.getAllUser();
        list.forEach(user -> System.out.println(user));
    }

    /**
     * MyBatis获取参数的两种方式：
     * 1. ${}(本质是字符串拼接)
     * 2. #{}(本质是占位符)
     */

    //1. mapper接口方法的参数为单个的字面量
    @Test
    public void testParameter1() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.getUser("张三"));
    }

    //2. mapper接口方法的参数为多个时(以arg0... 或者param1... 为键，参数值为值)
    @Test
    public void testParameter2() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        System.out.println(mapper.checkLogin("张三", "123456"));
    }

    //3. mapper接口方法的参数为
    @Test
    public void testParameter3() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
    }

    @Test
    public void checkLoginByMap() {
        SqlSession sqlSession = SqlSessionUtils.getSqlSession();
        ParameterMapper mapper = sqlSession.getMapper(ParameterMapper.class);
        Map<String,Object> map = new HashMap<>();
        map.put("username","张三");
        map.put("password","123456");
        User user = mapper.checkLoginByMap(map);
        System.out.println(user);
    }
}
