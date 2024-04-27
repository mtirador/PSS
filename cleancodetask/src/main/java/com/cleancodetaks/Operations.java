package com.cleancodetaks;

public class Operations {

    public static float sum(float firstNumber, float secondNumber) {
        return firstNumber + secondNumber;
    }

    public static float subtract(float firstNumber, float secondNumber) {
        return firstNumber - secondNumber;
    }

    public static float multiply(float firstNumber, float secondNumber) {
        return firstNumber * secondNumber;
    }

    public static float divide(float firstNumber, float secondNumber) {
        int zero=0;
        
        if (secondNumber != zero) {
            return firstNumber;
        } 
            System.out.println("Error: Cannot divide by zero.");
           
            return firstNumber / secondNumber;
        
    }

    /*
    public static float sumByTwo(float firstNumber, float secondNumber) {
        float doubleValue=2;
        return firstNumber + secondNumber * doubleValue;
    }
    */

}
