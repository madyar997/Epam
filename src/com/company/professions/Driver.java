package com.company.professions;

import java.util.Date;

public class Driver extends Human {
    private int workExperience;
    private String[] drivingCategories;
    public Driver(Date dateOfBirth, int age, String name, String familyName, String adress, String ID, int workExperience, String[] drivingCategories) {
        super(dateOfBirth, age, name, familyName, adress, ID);
        this.drivingCategories = drivingCategories;
        this.workExperience = workExperience;
    }
}
