package com.example.springmybatis.service.impl;

import com.example.springmybatis.entity.TestUser;
import com.example.springmybatis.mapper.UserMapper;
import com.example.springmybatis.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service

public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;




    @Override
    public TestUser getUserByid(Long uid) {
        return userMapper.getUserByid(uid);
    }

    @Override
    public int getCount() {
        return userMapper.getCount();
    }
}
