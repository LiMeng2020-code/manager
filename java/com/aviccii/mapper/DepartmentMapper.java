package com.aviccii.mapper;

import com.aviccii.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author aviccii 2020/8/20
 * @Discrimination
 */
@Mapper
@Repository
public interface DepartmentMapper {
    List<Department> queryDepList();
}
