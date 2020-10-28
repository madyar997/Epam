package com.company.factory_metod.abdi_factory;

class PencilCreator extends Creator {
    @Override
    public WritingStuff factoryMethod() {
        return new Pencil();
    }
}
