package com.thetestingacademy.ex_samplecheck;

public class ApiTesting004_BuilderDesignPattern {
    public ApiTesting004_BuilderDesignPattern step1(){
        System.out.println("step1");
        return this;
    }
    public ApiTesting004_BuilderDesignPattern step2(){
        System.out.println("step1");
        return this;
    }
    public ApiTesting004_BuilderDesignPattern step3(String param1){
        System.out.println("Krishna");
        return this;
    }

    public static void main(String[] args) {
        ApiTesting004_BuilderDesignPattern bp = new ApiTesting004_BuilderDesignPattern();
        bp.step1().step2().step3("Hello");

    }
}
