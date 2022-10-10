package com.devops.CalculatorAPI.model;

import org.springframework.stereotype.Component;

@Component
public class Operations {


    public double addition(double n1, double n2) {
        return n1+n2;
    }

    public  double substraction(double n1, double n2) {
        return n1-n2;
    }

    public double multiplication(double n1, double n2) {
        return n1*n2;
    }

    public double division(double n1, double n2){
        return (n2 != 0)? n1/n2 : 0;
    }

}
