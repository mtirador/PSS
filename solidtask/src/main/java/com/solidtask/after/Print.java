package com.solidtask.after;

public class Print {

    public static void printAnimalInfo(Animal animal) {
        System.out.println("Name: " + animal.getName());
        System.out.println("Sound: " + animal.makeSound());
        if (animal instanceof Flying) {
            Flying flyingAnimal = (Flying) animal;
            System.out.println("Flight Distance: " + flyingAnimal.flightDistance());
        } else {
            System.out.println("Flight Distance: This animal cannot fly.");
        }
        System.out.println("Number of Teeths: " + animal.getNumberOfTeeths());
    }
}
