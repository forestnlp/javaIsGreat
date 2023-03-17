package com.javacore.jdbcdemo.dao;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();
    int addEmp(Emp emp);
}
