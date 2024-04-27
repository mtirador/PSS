package com.solidtask.after;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Meow";
    }


    @Override
    public int getNumberOfTeeths() {
        return 30; 
    }
}
