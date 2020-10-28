package com.company.singleton.my_example;

public class Main {
    public static void main(String[] args) {
        for(int i = 0; i<10; i++){
            PenSingleton penSingleton = PenSingleton.makePenSingleton();
            System.out.println(penSingleton);
        }
    }

}
