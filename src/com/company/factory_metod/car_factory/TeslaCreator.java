package com.company.factory_metod.car_factory;

class TeslaCreator extends Creator {

    @Override
    public Car factoryMethod() {
        return new Tesla();
    }
}
