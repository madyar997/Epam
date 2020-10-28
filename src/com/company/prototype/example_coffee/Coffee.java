package com.company.prototype.example_coffee;

public class Coffee implements Cloneable{
    private String name;

    public Coffee(String name) {
        this.name = name;
    }

    @Override
    protected Coffee clone() throws CloneNotSupportedException {
        return (Coffee)super.clone();
    }
}
