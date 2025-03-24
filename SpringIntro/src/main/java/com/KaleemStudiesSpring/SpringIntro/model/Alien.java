package com.KaleemStudiesSpring.SpringIntro.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    private int age;
    private char gender;

    @Autowired
    @Qualifier("lap1")
    private Laptop laptop;

    @Override
    public String toString() {
        return "Alien{" +
                "age=" + age +
                ", gender=" + gender +
                ", laptop=" + laptop +
                '}';
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Alien() {
        System.out.println("\nAlien object created");
    }
    public void sayHello() {
        System.out.println("Hello World");
        laptop.compile();
    }
}
