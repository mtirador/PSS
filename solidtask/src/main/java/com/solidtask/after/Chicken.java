package com.solidtask.after;

public class Chicken extends Animal {

    public Chicken(String name) {
        super(name);
    }

    @Override
    public String makeSound() {
        return "Cluck";
    }

    @Override
    public int getNumberOfTeeths() {
        return 0; // Las gallinas no tienen dientes
    }
}
