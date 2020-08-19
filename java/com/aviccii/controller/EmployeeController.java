package com.aviccii.controller;

import com.aviccii.mapper.UserMapper;
import com.aviccii.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author aviccii 2020/8/19
 */

@Controller
public class EmployeeController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping("/usrs")
    public String list(Model model){
        List<User> users = userMapper.queryUserList();
        model.addAttribute("users",users);
        return "users/tables";
    }
}
