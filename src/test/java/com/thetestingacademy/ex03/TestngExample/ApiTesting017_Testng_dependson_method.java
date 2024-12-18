package com.thetestingacademy.ex03.TestngExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTesting017_Testng_dependson_method {
     @Test
    public void serverstartedok(){
        System.out.println("i will run first");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "serverstartedok()")
    public void method1(){
        System.out.println("method1");
        Assert.assertTrue(true);
    }
    @Test(dependsOnMethods = "method1()")
    public void method2(){
        System.out.println("method2");
        Assert.assertTrue(true);
    }


}
