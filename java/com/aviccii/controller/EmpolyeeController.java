package com.aviccii.controller;

import com.aviccii.mapper.EmpolyeeMapper;
import com.aviccii.mapper.UserMapper;
import com.aviccii.pojo.Department;
import com.aviccii.pojo.Empolyee;
import com.aviccii.pojo.User;
import com.aviccii.service.DepartmentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author aviccii 2020/8/19
 */

@Controller
public class EmpolyeeController {

    @Autowired
    UserMapper userMapper;

    @Autowired
    DepartmentService departmentService;
    private EmpolyeeMapper empolyeeMapper;

    public EmpolyeeController(EmpolyeeMapper empolyeeMapper) {
        this.empolyeeMapper = empolyeeMapper;
    }

    @ResponseBody
    @GetMapping("/queryEmp")
    public List<Empolyee> query(){
        List<Empolyee> empolyees = empolyeeMapper.queryEmpList();
        for (Empolyee empolyee : empolyees) {
            System.out.println(empolyee);
        }
        return empolyees;
    }

    @RequestMapping("/usrs")
    public String list(Model model){
        List<User> users = userMapper.queryUserList();
        List<Department> departments = departmentService.queryDepList();
        model.addAttribute("users",users);
        model.addAttribute("departments",departments);
        return "users/tables";
    }

    @RequestMapping("/emps")
    public String empList(Model model, HttpSession session){
        List<Empolyee> empolyees = empolyeeMapper.queryEmpList();
        model.addAttribute("empolyees",empolyees);
        return "users/datatables";
    }

    @GetMapping("/emp")
    public String toAddpage(Model model){
        List<Department> departments = departmentService.queryDepList();
        model.addAttribute("departments",departments);
        return "users/addEmps";
    }

    @PostMapping("/emp")
    public String AddEmp(@RequestParam("name")String name, @RequestParam("email")String email,
                         @RequestParam("gender")int gender, @RequestParam("department.id")int depid, @RequestParam("salary")int salary){
         empolyeeMapper.save(name,email,gender,depid,salary);
        return "redirect:/emps";
    }
}
