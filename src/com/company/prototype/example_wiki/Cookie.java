package com.company.prototype.example_wiki;

public class Cookie implements Cloneable{
    protected int weight;

    @Override
    protected Cookie clone() throws CloneNotSupportedException {
        return (Cookie)super.clone();
    }
}
