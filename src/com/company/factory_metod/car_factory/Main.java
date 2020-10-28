package com.company.factory_metod.car_factory;

class Main {
    public static void main(String[] args) {
        Creator[] creators = {
                new MercedesCreator(),
                new TeslaCreator()
        };
        for (Creator creator : creators) {
            System.out.println(creator.factoryMethod());
        }
        Mercedes mercedes = new Mercedes();
        Mercedes mercedes1 = (Mercedes) new MercedesCreator().factoryMethod();
    }
}
