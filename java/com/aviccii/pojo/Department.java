package com.aviccii.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author aviccii 2020/8/20
 * @Discrimination
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Department {
    private int id;
    private String departmentName;
}
