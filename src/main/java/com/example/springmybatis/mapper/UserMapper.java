package com.example.springmybatis.mapper;

import com.example.springmybatis.entity.TestUser;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    public TestUser getUserByid(@Param("uid")  Long uid);

    public int getCount();
}
