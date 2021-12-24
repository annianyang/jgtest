package com.example.springmybatis.service;

import com.example.springmybatis.entity.TestUser;
import org.apache.ibatis.annotations.Param;


public interface UserService {

    public TestUser getUserByid(@Param("uid")  Long uid);

    public int getCount();
}
