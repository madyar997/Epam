package com.company.prototype.my_example;

public class WritingStuff implements Cloneable {
    @Override
    protected WritingStuff clone() throws CloneNotSupportedException {
        return (WritingStuff) super.clone();
    }
}
