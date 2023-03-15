package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("myPet", Dog.class);
        System.out.println(pet);
        context.close();
    }
}
