package com.jonas.interfaceabstract.models;

// abstract - inheritance (arv)
// by default methods are private
public interface Animal {

    // TODO: 2023-10-03 - Give relevant names
    // TODO: 2023-10-03 - Implement Inheritance
    // TODO: 2023-10-03 - SUPER VIKTIGT: private vis/mod
    // TODO: 2023-10-03 -

    void name();
    void move();
    void eat();
    void sleep();
    void makeSound();

    default void typeOfAnimal(String typeOfAnimal){
        System.out.println(typeOfAnimal);
    }


    //default
    default void test() {
    }


    //Abstract method
    void myAbstractMethod();



}
