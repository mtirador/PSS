package com.cleancodetaks;


public class Calculator {
    
    public static double calculateWithOperation(float firstNumber) {
     
        firstNumber = Operations.sum(firstNumber, 5);
        firstNumber = Operations.multiply(firstNumber, 3);
        firstNumber = Operations.subtract(firstNumber, 2);
        firstNumber = Operations.divide(firstNumber, 4);

        firstNumber = Operations.sum(firstNumber, 10);
        firstNumber = Operations.multiply(firstNumber, 2);
       // firstNumber = Operations.sumByTwo(firstNumber, 5f);
        firstNumber = Operations.sum(firstNumber, 10);

        firstNumber = Operations.multiply(firstNumber, 3);
        firstNumber = Operations.divide(firstNumber, 8);
        firstNumber = Operations.sum(firstNumber, 2);

        return firstNumber;
    }

    
    
}
