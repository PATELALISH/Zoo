package com.zoo.animals;

public class Bird extends Animal implements Flyable {

    public Bird(String name, int age) {
        super(name, age, AnimalSpecies.Bird);
    }

    @Override
    public void fly() {
        System.out.println(getName() + " is flying");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " makes sound");
    }
}
