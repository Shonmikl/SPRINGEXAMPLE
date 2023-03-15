package org.example;

public class Person {
    private Pet pet;

    public Person(Pet pet) {
        System.out.println("Person constructor");
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        System.out.println("Person setter");
        this.pet = pet;
    }

    public void call() {
        System.out.println("Person call");
        pet.say();
    }
}