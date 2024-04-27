package com.task2;

import java.util.ArrayList;
import java.util.List;

public class NumberChecker {
public static List<Integer>checkNumber(int inputNumber) {    
        List<Integer>numbers = new ArrayList<>();
        if (inputNumber>=0) {
            System.out.println("Positive Number");
            for (int number=inputNumber;number>=0;number-= 2) {
                System.out.println(number);
                numbers.add(number);
            }
        } else {
            System.out.println("Negative Number");
            for (int number=inputNumber;number<=0;number+=2) {
                System.out.println(number);
                numbers.add(number);
            }
        }
        return numbers;
    }
}
