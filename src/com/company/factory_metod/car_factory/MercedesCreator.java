package com.company.factory_metod.car_factory;

class MercedesCreator extends Creator {

    @Override
    public Car factoryMethod() {
        return new Mercedes();
    }
}
