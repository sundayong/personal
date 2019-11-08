package com.sundayong.personal.service.impl;

import com.sundayong.personal.mapper.UserMapper;
import com.sundayong.personal.model.User;
import com.sundayong.personal.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    //用户mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> userList() {
        return userMapper.list();
    }
}
