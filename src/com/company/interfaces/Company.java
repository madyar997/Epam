package com.company.interfaces;

public class Company extends Global implements Software {
    private String name;
    private int size;
    private static int count;

    public Company(String name, int size) {
        this.name = name;
        this.size = size;
        count++;
    }


    public Company() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>2 && name.length()<100)
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0 && size < 10000000)
            this.size = size;
    }

    @Override
    public void createSoftware() {
        System.out.println(name + " Create software");
    }

    @Override
    public void abstractGlobal() {
        System.out.println("Реализация абстрактного метода, абстрактного класса");
    }
}
