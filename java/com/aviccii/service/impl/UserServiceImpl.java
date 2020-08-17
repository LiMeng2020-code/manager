package com.aviccii.service.impl;

import com.aviccii.mapper.UserMapper;
import com.aviccii.pojo.User;
import com.aviccii.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author aviccii 2020/8/17
 */
@Service(value = "userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;


    @Override
    public List<User> getAllUser() {
        return userMapper.getAllUser();
    }

    @Override
    public User getAllUserByName(String name) {
        return userMapper.getAllUserByName(name);
    }

    @Override
    public User loginPage(String name, String id) {
        return userMapper.loginPage(name,id);
    }
}
