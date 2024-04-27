package com.task23;

import java.util.Scanner;

public class SaveData{

    public static void getInputData() {
        double hoursWork, rate;
        Scanner input=new Scanner(System.in);
        Data inputData=ReadScanner.readNumber(input);
        hoursWork= inputData.getHoursWork();
        rate=inputData.getRate();
        
        CalculateSalary.salary(hoursWork, rate);
    }

   
}
