package com.javacore.genericdemo;

import java.util.ArrayList;
import java.util.List;

public class GenericUpperLower {

    static class Being{

    }

    static class Animal extends Being{

    }

    static class Dog extends Animal{

    }

    public static void main(String[] args) {

        List<Being> ls1 = new ArrayList<>();
        List<Animal> ls2 = new ArrayList<>();
        List<Dog> ls3 = new ArrayList<>();

        List<?extends Animal> ls4 = null;
        ls4 = ls3;
        ls4 = ls2;

        List<?super Animal> ls5 = null;
        ls5 = ls1;
        ls5 = ls2;


    }

}
