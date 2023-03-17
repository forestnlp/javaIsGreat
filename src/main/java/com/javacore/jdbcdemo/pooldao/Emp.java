package com.javacore.jdbcdemo.pooldao;

import java.io.Serializable;

public class Emp implements Serializable {
    private int id;
    private String name;
    private int res;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", res=" + res +
                '}';
    }

    public Emp() {
    }

    public Emp(String name, int res) {
        this.name = name;
        this.res = res;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRes() {
        return res;
    }

    public void setRes(int res) {
        this.res = res;
    }
}
