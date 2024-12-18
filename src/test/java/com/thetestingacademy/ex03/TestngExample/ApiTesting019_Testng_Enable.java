package com.thetestingacademy.ex03.TestngExample;

import org.testng.annotations.Test;

public class ApiTesting019_Testng_Enable {
    @Test(enabled = false)
    public void t1(){
        System.out.println(1);
    }
    @Test()
    public void t2(){
        System.out.println(3);
    }
    @Test()
    public void t3(){
        System.out.println(2);
    }
    @Test()
    public void t4(){
        System.out.println(4);
    }


}
