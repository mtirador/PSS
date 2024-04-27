package com.task2;

import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;
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
    public void testEvenNumber() {
      int inputTest = 6;
        List<Integer> numberList = new ArrayList<>();
        numberList.add(6);
        numberList.add(4);
        numberList.add(2);
        numberList.add(0);
        List<Integer> actualNumbers = NumberChecker.checkNumber(inputTest);
        assertEquals(numberList, actualNumbers);
    }

    @Test
    public void testOddNumber(){
      int inputTest = 9;
      List<Integer> numberList = new ArrayList<>();
      numberList.add(9);
      numberList.add(7);
      numberList.add(5);
      numberList.add(3);
      numberList.add(1);
      List<Integer> actualNumbers = NumberChecker.checkNumber(inputTest);
      assertEquals(numberList, actualNumbers);
    }

    @Test
    public void testNegativeNumber() {
       int inputTest = -4;
       List<Integer> numberList = new ArrayList<>();
       numberList.add(-4);
       numberList.add(-2);
       numberList.add(0);
       List<Integer> actualNumbers = NumberChecker.checkNumber(inputTest);
       assertEquals(numberList, actualNumbers);
  }

    
}
