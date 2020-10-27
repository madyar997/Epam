package com.company.professions;

import java.util.Date;

public class Human {
    private Date dateOfBirth;
    private int age;
    private String name;
    private String familyName;
    private String adress;
    private String ID;

    public Human(Date dateOfBirth, int age, String name, String familyName, String adress, String ID) {
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.name = name;
        this.familyName = familyName;
        this.adress = adress;
        this.ID = ID;
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setDateOfBirth(Date dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public Date getDateOfBirth(){
        return dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
