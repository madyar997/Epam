package com.company.interfaces;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Company company = new Company();
        company.setName("am");
        company.setSize(10000001);
        System.out.println(company.getSize());
        System.out.println(company.getName());

        Company company1 = new Company("Microsoft", 100000);
        System.out.println(company1.getName());

        company1.createSoftware();
        company1.abstractGlobal();
        company1.globalCompany();
        //реализовали интрейфе  с Software с помощью конструктора класса DesktropSoftware
        Software software = new DesktopSoftware();
        software.createSoftware();
        //Реализовали инт-йс Softwareс помощью конст-ра класса Mobile Software
        software = new MobileSoftware();
        software.createSoftware();

        //Полиморфизм реализайия одно идеи несколькмим способами
        Apple apple = new Apple();
        Company company2 = apple;



        System.out.println(Company.getCount());
        Object object = new Company();


    }
}
