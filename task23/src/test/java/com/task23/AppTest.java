package com.task23;


import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalculateOverTimePay() {
        Data test1 = new Data(40, 10); 
        Data test2 = new Data(44, 10);
        Data test3 = new Data(50, 12); 

        assertEquals(0.0, CalculateSalary.getOvertimePay(test1.getHoursWork(), test1.getRate()), 0.01);
        assertEquals(60.0, CalculateSalary.getOvertimePay(test2.getHoursWork(), test2.getRate()), 0.01);
        assertEquals(180.0, CalculateSalary.getOvertimePay(test3.getHoursWork(), test3.getRate()), 0.01);
    }

    @Test
    public void testCalculateRegularPay(){
        Data test1 = new Data(40, 10); 
        Data test2 = new Data(30, 10);
        Data test3 = new Data(32, 12); 

        assertEquals(400.0, CalculateSalary.getRegularPay(test1.getHoursWork(), test1.getRate()), 0.01);
        assertEquals(300.0, CalculateSalary.getRegularPay(test2.getHoursWork(), test2.getRate()), 0.01);
        assertEquals(384.0, CalculateSalary.getRegularPay(test3.getHoursWork(), test3.getRate()), 0.01);
    }

    @Test
    public void testCalculateRegularPayDecimal(){
        Data test1 = new Data(37.5, 12.5); 

        assertEquals(468.75, CalculateSalary.getRegularPay(test1.getHoursWork(),test1.getRate()),0.01);

    }

    @Test
    public void testCalculateOverTimePayDecimal(){
        Data test1 = new Data(47.5, 12.5); 

        assertEquals(140.625, CalculateSalary.getOvertimePay(test1.getHoursWork(),test1.getRate()),0.01);

    }

    @Test
    public void testLimitsHoursWork(){
        Data test1 = new Data(40.0, 10.0); 
        Data test2 = new Data(40.5, 10.0);

        assertEquals(400,CalculateSalary.getRegularPay(test1.getHoursWork(),test1.getRate()),0.01);
        assertEquals(7.5,CalculateSalary.getOvertimePay(test2.getHoursWork(),test2.getRate()),0.01);
    }

    @Test
    public void testRateZero(){
        Data test1 = new Data(0, 10.0); 

        assertEquals(0,CalculateSalary.getRegularPay(test1.getHoursWork(),test1.getRate()),0.01);
    }
  
        


    
}
