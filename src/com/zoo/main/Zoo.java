package com.zoo.main;

import com.zoo.animals.Animal;
import com.zoo.animals.Flyable;
import com.zoo.animals.Swimmable;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo(){
        this.animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void performFly(Animal animal){
        if (animal instanceof Flyable){
            ((Flyable) animal).fly();
        }
        else System.out.println("Can not fly");
    }

    public void performSwim(Animal animal){
        if (animal instanceof Swimmable){
            ((Swimmable) animal).swim();
        } else System.out.println("Can not swim");
    }

    public void makeAnimalsMakeSound(){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }
}
