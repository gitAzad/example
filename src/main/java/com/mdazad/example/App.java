package com.mdazad.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Calc calc = new Calc();
        int result = calc.add(2).add(2).subtract(1).multiply(2).divide(2).getResult();
        System.out.println("Result: " + result);
    }
}
