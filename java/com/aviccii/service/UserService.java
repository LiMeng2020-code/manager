package com.aviccii.service;

import com.aviccii.pojo.User;

import java.util.List;

/**
 * @author aviccii 2020/8/17
 */
public interface UserService {
    List<User> getAllUser();
    User getAllUserByName(String name);
    User loginPage(String name, String id);
}
