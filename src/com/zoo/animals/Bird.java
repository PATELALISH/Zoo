package com.zoo.animals;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age, String species) {
        super("Bird", age, species);
    }

    @Override
    public void fly() {
        System.out.println("Birds can fly");
    }

    @Override
    public void makeSound() {

    }
}
