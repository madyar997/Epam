package com.company.singleton.my_example;

public class PenSingleton {
    private int Color;
    static PenSingleton instance;
    private PenSingleton() {}
    public static PenSingleton makePenSingleton() {
        if(instance==null){
            instance = new PenSingleton();
        }
        return instance;
    }
}
