package com.company.factory_metod.abdi_factory;

class PenCreator extends Creator {
    @Override
    public WritingStuff factoryMethod() {
        return new Pen();
    }
}
