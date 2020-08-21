package com.aviccii.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author aviccii 2020/8/19
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Empolyee {
    private int id;
    private String name;
    private String email;
    private int gender;
    private Department department;
    private int salary;

}
