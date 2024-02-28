package com.HomeWork.CalculatorTest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {

    private final CalculatorServis hello;



    public CalculatorController(CalculatorServis hello){
        this.hello=hello;
    }
    @GetMapping()
    public String hello(){
        return hello.hello();
    }
    @GetMapping(path = "/plus")
    public String plusNumbers(@RequestParam(required = false) Integer num1,@RequestParam (required = false)Integer num2){
        if(num1==null||num2==null){
            return "одного числа нет";
        }

        return (num1+"+"+num2+"="+hello.plus(num1,num2));
    }

    @GetMapping(path = "/minus")
    public String minusNumbers(@RequestParam (required = false)Integer num1,@RequestParam(required = false) Integer num2){
        if(num1==null||num2==null){
            return "одного числа нет";
        }
        return (num1+"+"+num2+"="+hello.minus(num1,num2));
    }
    @GetMapping(path = "/multiply")
    public String multiplyNumbers(@RequestParam (required = false)Integer num1,@RequestParam (required = false) Integer num2){

        if(num1==null||num2==null){
            return "одного числа нет";
        }
        if(num2!=0) {
            return (num1+"/"+ num2+"="+hello.multiply(num1,num2));
        }else {
            return " на ноль не делится";
        }
    }
    @GetMapping(path = "/divide")
    public String divideNumbers(@RequestParam (required = false)Integer num1,@RequestParam (required = false) Integer num2){
        if(num1==null||num2==null){
            return "одного числа нет";
        }
        return (num1+"*"+num2+"="+hello.divide(num1,num2));
    }
}