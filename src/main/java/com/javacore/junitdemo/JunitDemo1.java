package com.javacore.junitdemo;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

public class JunitDemo1 {

    @Before
    public void before(){
        System.out.println("test starts");
    }

    @After
    public void after(){
        System.out.println("test ends");
    }


    @Test
    public void testAssert(){
        int i = new Random().nextInt(5);
        Assert.assertEquals(4,i);
    }

}
