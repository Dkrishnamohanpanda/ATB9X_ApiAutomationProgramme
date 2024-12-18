package com.thetestingacademy.ex03.TestngExample;

import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ApiTesting018_Testng_parameter {
    @Parameters("browser")
    @Test
     public void demo1(String value){
        System.out.println("Browser is " + value);
        if(value.equalsIgnoreCase("chrome")){
            System.out.println("Start my testing in chrome");
        }
        if(value.equalsIgnoreCase("firefox")){
            System.out.println("Start my testing in firefox");
        }

     }


}
