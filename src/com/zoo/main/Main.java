package com.zoo.main;

import com.zoo.animals.Bird;
import com.zoo.animals.Fish;
import com.zoo.animals.Mammal;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        Bird sparrow = new Bird("Sparrow", 2);
        Fish goldfish = new Fish("Goldfish", 3);
        Mammal lion = new Mammal("Lion", 4);

        zoo.addAnimal(sparrow);
        zoo.addAnimal(goldfish);
        zoo.addAnimal(lion);

        zoo.performFly(sparrow);
    }
}
