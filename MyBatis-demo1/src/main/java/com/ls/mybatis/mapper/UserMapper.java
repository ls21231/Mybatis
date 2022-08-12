package com.ls.mybatis.mapper;

/**
 * @ls
 * @create 2022 -- 07 -- 14
 */
public interface UserMapper {
    /**
     * Mybatis面向接口编程的两个一致
     * 1. 映射文件的namespace要和Mapper接口的全类名保持一致
     * 2. 映射文件中SQl语句的id要和mapper接口中的方法名一致
     */

    /**
     * 添加用户信息
     */
    int insertUser();

    /**
     * 修改用户信息
     */
    int updateUser();
}
