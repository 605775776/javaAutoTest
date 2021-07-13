package com.example.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author dsw
 * @Description
 * @create 2021-07-13 14:57
 */
public class GroupsOnMethod {


    @Test(groups = "server")
    public void test1(){
        System.out.println("server1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("server2");
    }

    @Test(groups = "server")
    public void test3(){
        System.out.println("server3");
    }


    @Test(groups = "client")
    public void test4(){
        System.out.println("client1");
    }

    @Test(groups = "client")
    public void test5(){
        System.out.println("client2");
    }

    @BeforeGroups("server")
    public void BeforeGroupsOnServer(){
        System.out.println("BeforeGroupsOnServer");
    }

    @AfterGroups("server")
    public void AfterGroupsOnServer(){
        System.out.println("AfterGroupsOnServer");
    }

}
