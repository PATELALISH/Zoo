package com.zoo.animals;

public class Fish extends Animal implements Swimmable {

    public Fish(String name, int age) {
        super(name, age, "Fish");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " can make sound");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
