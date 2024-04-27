package com.solidtask.after;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Woof! Woof!";
    }


    @Override
    public int getNumberOfTeeths() {
        return 42; 
    }
}
