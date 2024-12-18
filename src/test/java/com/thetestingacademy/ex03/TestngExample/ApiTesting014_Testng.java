package com.thetestingacademy.ex03.TestngExample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ApiTesting014_Testng {
    @BeforeTest()
    public void getToken(){
        System.out.println("1");
    }
    @BeforeTest()
    public void getBookingID(){
        System.out.println("2");
    }
    @Test
    public void test_Put(){
        System.out.println("3");
    }
    @AfterTest
    public void closeAllThings(){
        System.out.println("Close");
    }

}
