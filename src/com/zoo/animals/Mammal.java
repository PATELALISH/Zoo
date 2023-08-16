package com.zoo.animals;

public class Mammal extends Animal {
    public Mammal(String name, int age) {
        super(name, age, AnimalSpecies.MAMMAL);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " can make sound");
    }
}
