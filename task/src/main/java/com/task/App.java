package com.task;

import java.util.ArrayList;

public class App 
{
    public static void main(String[] args) {
        getListExercise();
    }

    private static void getListExercise() {
        int inicialNumber = 1, finalNumber = 100, multiplesThree = 3, multiplesFive = 5;
        ArrayList<String> listExercise = exerciseFizz(inicialNumber, finalNumber, multiplesThree, multiplesFive);

        for (String list : listExercise) {
            System.out.println(list);
        }
    }

    public static ArrayList<String> exerciseFizz(int inicialNumber, int finalNumber, int multiplesThree, int multiplesFive) {
        ArrayList<String> textList = new ArrayList<>();
        for (int number = inicialNumber; number<= finalNumber; number++) {
            String text = (number% multiplesThree == 0 && number % multiplesFive == 0)?"FizzBuzz":(number % multiplesThree== 0)?"Fizz":(number % multiplesFive == 0)?"Buzz":Integer.toString(number);
            textList.add(text);
        }
        return textList;
    } 
}
