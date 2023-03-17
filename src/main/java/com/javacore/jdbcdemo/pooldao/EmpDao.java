package com.javacore.jdbcdemo.pooldao;

import java.util.List;

public interface EmpDao {
    List<Emp> findAll();
    int addEmp(Emp emp);
}
