package com.javacore.jdbcdemo.pooldao;

import java.util.List;

public class EmpDaoImpl extends BaseDao implements EmpDao {

    @Override
    public List<Emp> findAll() {
        String sql = "select * from test";
        return baseQuery(Emp.class,sql);
    }

    @Override
    public int addEmp(Emp emp) {
        String sql = "insert into test(name,res) values (?,?) ";
        int i = baseUpdate(sql, emp.getName(),emp.getRes());
        return i;
    }
}
