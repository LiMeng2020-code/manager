package com.aviccii.service.impl;

import com.aviccii.mapper.EmpolyeeMapper;
import com.aviccii.pojo.Empolyee;
import com.aviccii.service.EmpolyeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author aviccii 2020/8/21
 * @Discrimination
 */
@Service
public class EmpolyeeServiceImpl implements EmpolyeeService {

    @Autowired
    private EmpolyeeMapper empolyeeMapper;

    public EmpolyeeServiceImpl(EmpolyeeMapper empolyeeMapper) {
        this.empolyeeMapper = empolyeeMapper;
    }

    @Override
    public List<Empolyee> queryEmpList() {
        return empolyeeMapper.queryEmpList();
    }
}
