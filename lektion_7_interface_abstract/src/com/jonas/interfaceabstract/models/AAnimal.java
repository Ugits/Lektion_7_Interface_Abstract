package com.jonas.interfaceabstract.models;

//Abstract class - marked by keyword abstract
// todo - test vis mod
// can inherit from both: interface and abstract classes
public abstract class AAnimal {

    public AAnimal(){

    }
    public abstract void eat();

    public void makeSound(){
        System.out.println("some random animal noice");
    }

}
