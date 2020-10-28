package com.company.factory_metod.abdi_factory;

public class AbdiFactory {
    public static void main(String[] args) {
        Creator creators[] = {new PencilCreator(),
                              new PenCreator(),
                              new PencilCreator(),
                              new PencilCreator(),
                              new PenCreator()};
        for (Creator creator:creators){
            WritingStuff writingStuff = creator.factoryMethod();
            System.out.println(writingStuff);
        }
    }
}
