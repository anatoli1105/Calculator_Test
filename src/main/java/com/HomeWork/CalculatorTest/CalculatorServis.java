package com.HomeWork.CalculatorTest;

import org.springframework.stereotype.Service;

@Service

public class CalculatorServis{
    public String hello(){
        return "добро пожаловать в калькулятор";
    }

    public int plus(int num1,int num2){
        return (num1+num2);
    }
    public int minus(int num1,int num2){
        return (num1-num2);
    }
    public int multiply(int num1,int num2) {
        if(num2!=0) {

            return (num1 / num2);
        }
        throw new IllegalArgumentException();

    }
    public int divide(int num1,int num2){
        return (num1 * num2);

    }



}
