package com.aviccii.service;

import com.aviccii.mapper.UserMapper;
import com.aviccii.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author aviccii 2020/8/18
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User dologin(String name){
        return this.userMapper.queryUserByName(name);
    }
}
