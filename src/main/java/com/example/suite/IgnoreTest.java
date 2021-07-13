package com.example.suite;

import org.testng.annotations.Test;

/**
 * @author dsw
 * @Description
 * @create 2021-07-13 14:54
 */
public class IgnoreTest {

    @Test
    public void ignoreTest1(){
        System.out.println("ignoreTest1");
    }

    @Test(enabled = false)
    public void ignoreTest2(){
        System.out.println("ignoreTest2");
    }
}
