
package com.example.calculator;

/**
 * The main class to run the calculator application.
 */
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sum = calc.add(10, 5);
        int difference = calc.subtract(10, 5);

        System.out.println("Welcome to the Calculator App!");
        System.out.println("-----------------------------");
        System.out.println("10 + 5 = " + sum);
        System.out.println("10 - 5 = " + difference);
    }
}
