package com.aviccii.service.impl;

import com.aviccii.mapper.DepartmentMapper;
import com.aviccii.pojo.Department;
import com.aviccii.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aviccii 2020/8/21
 * @Discrimination
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    @Override
    public List<Department> queryDepList() {
        return departmentMapper.queryDepList();
    }
}
