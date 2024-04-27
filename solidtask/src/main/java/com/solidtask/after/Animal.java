package com.solidtask.after;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String makeSound();
    public abstract int getNumberOfTeeths();

    public String getName() {
        return this.name;
    }
}
