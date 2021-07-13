package com.example.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {

    // 执行次数10  线程池3个 timeout单位毫秒。取决于invocationCount决定次数
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s %n",Thread.currentThread().getId());
    }

}
