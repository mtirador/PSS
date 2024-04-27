package com.task23;

import java.util.InputMismatchException;
import java.util.Scanner;

class ReadScanner {

    public static Data readNumber(Scanner input){
        double hoursWork=0.0,rate=0.0;
        boolean flag=false;
        
 
        do{
            try {
                System.out.print("Enter your hours worked ");
                hoursWork = input.nextDouble();
                if (hoursWork >= 0) { 
                    flag = true;
                } else {
                    System.out.println("Error...Hours worked cannot be negative");
                }
              
            } catch(InputMismatchException e){
                System.out.println("Error...Enter a number");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Error...something went wrong");
                input.nextLine();
            }
        }while(!flag);

            flag=false;
        do{

            try {
                System.out.print("Enter the hourly rate ");
                rate=input.nextDouble();
                if (rate >= 0) { 
                    flag = true;
                } else {
                    System.out.println("Error...Hourly rate cannot be negative.");
                }
          
            }catch(InputMismatchException e){
                System.out.println("Error...Enter a number");
                input.nextLine();
            } catch (Exception e) {
                System.out.println("Error...something went wrong");
                input.nextLine();
            } 
            
           
        }while(!flag);
            return new Data(hoursWork, rate);
            
    }
     
}