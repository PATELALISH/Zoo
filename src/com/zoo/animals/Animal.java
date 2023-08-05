package com.zoo.animals;

public abstract class Animal {
    private String name;
    private int age;
    private String species;

    public Animal(String name, int age, String species){
        this.name = name;
        this.age = age;
        this.species = species;
    }

    //getter


    public String getName() {
        return name;
    }

    //abstract method
    public abstract void makeSound();
}
