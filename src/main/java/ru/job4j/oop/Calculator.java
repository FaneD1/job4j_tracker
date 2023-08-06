package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int c) {
        return x / c;
    }

    public static int minus(int b) {
        return x - b;
    }

    public int sumAllOperation(int d) {
        return sum(d) + multiply(d) + divide(d) + minus(d);
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println("Sum: " + result);
        Calculator calculator = new Calculator();
        result = calculator.multiply(5);
        System.out.println("Mult: " + result);
        result = calculator.divide(5);
        System.out.println("Div: " + result);
        result = minus(10);
        System.out.println("Sub: " + result);
        result = calculator.sumAllOperation(5);
        System.out.println("Sum All Operation: " + result);
    }
}