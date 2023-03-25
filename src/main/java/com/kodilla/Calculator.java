package com.kodilla;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public void doSomething() {
        System.out.println();
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("You cannot divide by zero");
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
        System.out.println(calculator.add(4,5));
        System.out.println(calculator.subtract(2,2));
        System.out.println(calculator.add(1,3));
        System.out.println(calculator.subtract(5,2));
        System.out.println(calculator.add(5,2));
        System.out.println(calculator.subtract(6,3));
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.subtract(15,1));

    }
}
