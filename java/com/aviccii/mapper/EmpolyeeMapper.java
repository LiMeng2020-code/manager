package com.aviccii.mapper;

import com.aviccii.pojo.Department;
import com.aviccii.pojo.Empolyee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author aviccii 2020/8/21
 * @Discrimination
 */
@Mapper
@Repository
public interface EmpolyeeMapper {
    List<Empolyee> queryEmpList();

    @Select("INSERT INTO empolyee (name, email, gender, salary, depid) VALUES (#{name}, #{email}, #{gender},#{salary},#{depid})")
     void save(@Param("name")String name,@Param("email")String email,
               @Param("gender")int gender,@Param("depid")int depid,@Param("salary")int salary);

    void deleteEmpolyeeById(int id);

//    @Select("update empolyee set name=#{name}, email=#{email}, gender=#{gender}, salary=#{salary}, depid=#{depid} where id={#id}")
    void alter( int id,String name,String email,
               int gender,int depid,int salary);
}
