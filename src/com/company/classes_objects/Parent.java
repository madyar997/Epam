package com.company.classes_objects;

public class Parent implements Cloneable {
    int age = 100;
    public void test(){
        System.out.println("Parent test");
    }
    public void newTest(){
        System.out.println("Parent New Test");
    }

    @Override
    protected Parent clone() throws CloneNotSupportedException {
        return (Parent)super.clone();

    }
}
