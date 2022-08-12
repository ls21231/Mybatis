package com.ls.mybatis.mapper;

import com.ls.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

/**
 * @ls
 * @create 2022 -- 07 -- 15
 */
public interface SelectMapper {
    User getUserById(@Param("id") Integer id);

    Integer getCount();
}
