package org.example;

public class Cat implements Pet {
    private String name;


    public Cat() {
        System.out.println("Cat constructor");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void say() {
        System.out.println("Cat say");
    }
}