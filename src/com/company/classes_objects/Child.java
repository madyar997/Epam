package com.company.classes_objects;

public class Child extends Parent {
    int age = 10;

    public Child() {
        super();
    }

    //Переопеределение -  создание новой логики
    @Override
    public void test() {
        //super.test();
        System.out.println("CHild test");
    }

    //Перегрузка - изменение сигнатуры метода (изменем тип даных, которые либо принимает либо выводим)
    // имя метода остается прежним, а принимаемые и возвращаемые араметры изменяем
    public void newTest(String string) {
        System.out.println(string);

    }
}
