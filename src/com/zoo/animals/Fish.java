package com.zoo.animals;

public class Fish extends Animal implements Swimmable {

    public Fish(String name, int age, String species) {
        super("Fish", age, species);
    }

    @Override
    public void makeSound() {
        System.out.println("Fish can make sound");
    }

    @Override
    public void swim() {
        System.out.println("Fish can swim");
    }
}
