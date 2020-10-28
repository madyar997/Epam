package com.company.metanit_gl3.interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Printable printable = new Book("Java. Complete Referense", "H.SHildt");
        printable.print();
        printable = new Journal("Maxim");
        printable.print();
        Printable p = new Journal("Liza");
        p.print();
        String name = ((Journal)p).getName();
        System.out.println(name);
        System.out.println(((Journal) p).getName());
        Printable.read();
        Printable book4 = new Book("Gore ot uma", "Griboedov");
        book4.print();
        Printable.read();
    }

}

interface Printable {
    default void print(){
        System.out.println("Undefined printable");
    }
    static void read(){
        System.out.println("Read printable");
    }
}
interface Sellable extends Printable{
    public void sell();
}
class Book implements Printable, Sellable {
    String name;
    String author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public void sell() {
        System.out.println("sell it");
    }
}


class Journal implements Printable{
    private String name;

    public Journal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}