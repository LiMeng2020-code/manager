package com.aviccii.controller;

import com.aviccii.mapper.UserMapper;
import com.aviccii.pojo.User;
import com.aviccii.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.tools.Tool;
import java.util.ArrayList;
import java.util.List;

/**
 * @author aviccii 2020/8/17
 */
@Controller
public class loginController {

    @Autowired
    private UserMapper userMapper;

    @ResponseBody
    @GetMapping("/queryUserList")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }


    @PostMapping(value = "/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Model model){

        //具体的业务

        if(userMapper.queryUserByName(username) == null){
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }
        User user = userMapper.queryUserByName(username);


        if (!StringUtils.isEmpty(username)&user.getPwd().equals(password))
        {
            model.addAttribute("loginUserName",username);
            return "index";
        }else {
            model.addAttribute("msg","用户名或者密码错误");
            return "login";
        }
    }
}
