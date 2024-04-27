package com.solidtask.after;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Fry");
        Dog dog = new Dog("Bender");
        Chicken chicken = new Chicken("PollitoPio");
        Duck duck = new Duck("Lucas");

        System.out.println("Cat:");
        Print.printAnimalInfo(cat);
        System.out.println();

        System.out.println("Dog:");
        Print.printAnimalInfo(dog);
        System.out.println();

        System.out.println("Chicken:");
        Print.printAnimalInfo(chicken);
        System.out.println();

        System.out.println("Duck:");
        Print.printAnimalInfo(duck);
        System.out.println();
    }
}
