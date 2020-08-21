package com.aviccii.mapper;

import com.aviccii.pojo.Department;
import com.aviccii.pojo.Empolyee;
import com.aviccii.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author aviccii 2020/8/17
 */
@Mapper
@Repository
public interface UserMapper {
    List<User> queryUserList();

    User queryUserByName(String name);


    int addUser(User user);

    int updateUser(User user);

    int deleteUser(int id);
 }
