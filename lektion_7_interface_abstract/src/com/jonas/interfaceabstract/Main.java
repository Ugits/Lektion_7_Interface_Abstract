package com.jonas.interfaceabstract;

import com.jonas.interfaceabstract.models.Cat;
import com.jonas.interfaceabstract.models.Dog;

public class Main {

    public static void main(String[] args) {

        // Instantiate object
        Cat kasper = new Cat();
        Dog fido = new Dog();

        kasper.name();
        kasper.move();
        kasper.eat();
        kasper.makeSound();
        kasper.sleep();
        kasper.typeOfAnimal("Cat");

        fido.eat();
        fido.move();
        fido.makeSound();
        fido.sleep();
        fido.name();
        fido.typeOfAnimal("Dog");

    }

}
