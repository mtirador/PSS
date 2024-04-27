package com.task2;

import java.util.Scanner;

public class ReadInput {
    
    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number to check: ");
        int number = input.nextInt();
        input.close();
        return number;
    }
}
