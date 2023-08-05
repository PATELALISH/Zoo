package com.zoo.animals;

public class Mammal extends Animal {
    public Mammal(String name, int age, String species) {
        super(name, age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Mammals can make sound");
    }
}
