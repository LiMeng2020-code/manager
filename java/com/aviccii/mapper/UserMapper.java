package com.aviccii.mapper;

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
    List<User> getAllUser();
    @Select("select name,id from where name=#{name}")
    User getAllUserByName(@Param("name") String name);
    User loginPage(String name,String id);
 }
