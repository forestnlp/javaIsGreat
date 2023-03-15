package com.javacore.annotationdemo;

import java.io.IOException;

/**
 * @author jay
 * @version 1.0
 */
public class AnnotaitionDemo1 {

    /**
     * @param i
     * @exception ioexception
     */
    @MyAnno("a")
    @SuppressWarnings("空方法")
    public void m1(int i) throws IOException {

    }

}
