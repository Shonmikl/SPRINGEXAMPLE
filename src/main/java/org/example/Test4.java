package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Cat C1 = context.getBean("myPet", Cat.class);
        Cat C2 = context.getBean("myPet", Cat.class);

        System.out.println(C1 == C2);
        System.out.println(C1);
        System.out.println(C2);

        context.close();
    }
}