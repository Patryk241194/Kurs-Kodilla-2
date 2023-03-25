package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("You cannot divide by 0");
        }
        return a / b;
    }

    public void doJob() {
        System.out.println("do");
    }


    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println(calculator.add(2,5));
        System.out.println(calculator.subtract(5,2));
        calculator.doJob();

    }
}
