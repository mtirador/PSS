package com.task;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;

import org.junit.Test;

/**
 * Unit test for simple App.
 */

 /*
  * Arrange(organizar)    Act(actuar)   Assert(confirmar)
  */

public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void ListSizeTest() {
        ArrayList<String> list = App.exerciseFizz(1, 100, 3, 5);
        assertEquals(100, list.size());

    
    }

    @Test
    public void fizzTestThree() {
        int inicialNumber = 1, finalNumber = 100, multiplesThree = 3, multiplesFive = 5;

        ArrayList<String> FizzList = App.exerciseFizz(inicialNumber, finalNumber, multiplesThree, multiplesFive);

        for (int number = inicialNumber; number <= finalNumber; number++) {
            if (number % multiplesThree == 0 && number % multiplesFive != 0) {
                assertEquals("Fizz", FizzList.get(number-1 ));
            }
        }
    }


    @Test
    public void buzzTestFive() {
        int inicialNumber=1,finalNumber=100,multiplesThree=3,multiplesFive=5;

        ArrayList<String> BuzzList = App.exerciseFizz(inicialNumber, finalNumber, multiplesThree, multiplesFive);

        for (int number = inicialNumber; number <= finalNumber; number++) {
            if (number % multiplesFive == 0 && number % multiplesThree != 0) {
                assertEquals("Buzz", BuzzList.get(number-1));
            }
        }
    }

    @Test
    public void fizzBuzzTest() {
        int inicialNumber=1,finalNumber=100,multiplesThree=3,multiplesFive=5;

        ArrayList<String> FizzBuzzList = App.exerciseFizz(inicialNumber, finalNumber, multiplesThree, multiplesFive);

        for (int number = inicialNumber; number <= finalNumber; number++) {
            if (number % multiplesThree == 0 && number % multiplesFive == 0) {
                assertEquals("FizzBuzz", FizzBuzzList.get(number-1));
            }
        }
    }

    @Test
    public void onlyNumber(){
        int inicialNumber=1,finalNumber=100,multiplesThree=3,multiplesFive=5;

        ArrayList<String> numberList = App.exerciseFizz(inicialNumber, finalNumber, multiplesThree, multiplesFive);

       for (int number = inicialNumber; number <= finalNumber; number++) {
            if (number % multiplesThree != 0 && number % multiplesFive != 0) {
                assertEquals(Integer.toString(number), numberList.get(number-1));
            }
        }
        
    }

}
