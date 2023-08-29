package com.kalkulator;

public class Calculator {

    public void sum(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void subt(int a, int b){
        int c = a - b;
        System.out.println(c);
    }

    public static void main(String[] args){
        Calculator calculator = new Calculator();
        calculator.sum(2,7);
        calculator.subt(5,2);
    }
}
