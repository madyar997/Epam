package com.company.classes_objects;

import com.company.singleton.example_wiki.Singleton;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Child child  = new Child();
        child.test();
        //System.out.println(child);

        Parent parent = child;
        Parent parent2 = parent.clone();
        System.out.println(parent);
        System.out.println(parent2);
        System.out.println("!");
        System.out.println(parent);
        parent.test();
        System.out.println(parent.age);
        System.out.println(child.age);
        Parent parent1 = new Child();
        System.out.println(parent1);
        System.out.println(parent1.age);
        parent1.test();

        child.newTest("Hello world");
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton1);
        System.out.println(singleton2);


    }
}
