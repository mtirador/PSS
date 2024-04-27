package com.task23;

class CalculateSalary {

    public static void salary(double hoursWork, double rate){
        
        double salary,regularPay,overtimePay;
        
        if (hoursWork <= getFullTime()) {
            salary=getRegularPay(hoursWork, rate);
        } else {
            regularPay=getRegularPay(getFullTime(), rate);
            overtimePay=getOvertimePay(hoursWork, rate); 
            salary=regularPay + overtimePay;
        }

        System.out.println("Salary: " + salary);
    }

    public static double getFullTime(){
        return 40;
    }

    public static double getRegularPay(double hoursWork, double rate){
        return hoursWork * rate;
    }

    public static double getOvertimePay(double hoursWork, double rate){
        double overHours= hoursWork-getFullTime();
        return  overHours*(rate*1.5);
    }

    
}