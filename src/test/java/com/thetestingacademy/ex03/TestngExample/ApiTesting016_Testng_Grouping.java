package com.thetestingacademy.ex03.TestngExample;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ApiTesting016_Testng_Grouping {
    @Test(groups ={"sanity","qa","prod" })
    public void sanityRun(){
        System.out.println("sanity");
        System.out.println("QA");
        Assert.assertTrue(true);
    }
    @Test(groups ={"reg" })
    public void regRun(){
        System.out.println("Reg");
        Assert.assertTrue(false);
    }
    @Test(groups ={"qa" })
    public void SmokeRun(){
        System.out.println("Smoke");
        Assert.assertTrue(false);
    }

}
