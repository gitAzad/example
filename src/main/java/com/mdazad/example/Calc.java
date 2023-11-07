package com.mdazad.example;

/**
 * The Calc class provides basic arithmetic operations such as addition,
 * subtraction, multiplication and division.
 */
public class Calc {

    private int result;

    /**
     * Adds the given number to the result.
     * 
     * @param a The number to add.
     * @return The Calc object.
     */
    public Calc add(int a) {
        result += a;
        return this;
    }

    /**
     * Suctract the given number to the result.
     * 
     * @param a The number to subtract.
     * @return The Calc object.
     */
    public Calc subtract(int a) {
        result -= a;
        return this;
    }

    /**
     * Devide the given number to the result.
     * 
     * @param a The number to divide.
     * @return The Calc object.
     */
    public Calc divide(int a) {
        result /= a;
        return this;
    }

    /**
     * Multiply the given number to the result.
     * 
     * @param a The number to multiply.
     * @return The Calc object.
     */
    public Calc multiply(int a) {
        result *= a;
        return this;
    }

    /**
     * Returns the result.
     * 
     * @return The result.
     */
    public int getResult() {
        return result;
    }

}
