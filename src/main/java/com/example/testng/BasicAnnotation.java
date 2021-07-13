package com.example.testng;

import org.testng.annotations.*;

/**
 * @author dsw
 * @Description
 * @create 2021-07-13 14:02
 */
public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("No 1");
    }

    @Test
    public void testCase2(){
        System.out.println("No 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("11111111");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("22222222");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }

}
