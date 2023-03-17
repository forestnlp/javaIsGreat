package com.javacore.jdbcdemo.dao;

import java.util.List;

public class DaoDemo {
    public static void main(String[] args) {

        EmpDao empDao = new EmpDaoImpl();
        empDao.addEmp(new Emp("a",1));

        List<Emp> all = empDao.findAll();
        for(Emp e:all)
         System.out.println(e);

    }
}
