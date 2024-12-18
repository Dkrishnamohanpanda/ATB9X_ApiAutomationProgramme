package com.thetestingacademy.ex04_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
//interview question
public class ApiTesting023_Testng_Assertions {
    @Test
    public void test_hardAssertExample(){
        System.out.println("Start of the programme");
        Boolean is_neeru_male =false;
        Assert.assertTrue(is_neeru_male);
        System.out.println("End of the programme");

        Assert.assertEquals("Krishna","Krishna");

    }
    @Test
    public void test_softAssertExample(){
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(false);
        System.out.println("This line will be executed");
        softAssert.assertAll();//this will report all collectee erors
    }



}
