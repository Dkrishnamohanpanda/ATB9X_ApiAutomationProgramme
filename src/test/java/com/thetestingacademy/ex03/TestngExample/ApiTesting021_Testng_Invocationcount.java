package com.thetestingacademy.ex03.TestngExample;

import org.testng.annotations.Test;

public class ApiTesting021_Testng_Invocationcount {
    //how many time you want to run this
    @Test(invocationCount = 5)
    public void t1(){
        System.out.println(1);
    }



}
