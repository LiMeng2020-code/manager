package com.aviccii.mapper;

import com.aviccii.pojo.Department;
import com.aviccii.pojo.Empolyee;
import org.apache.ibatis.annotations.Mapper;
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
}
