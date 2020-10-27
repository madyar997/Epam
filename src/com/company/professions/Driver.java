package com.company.professions;

import java.util.Date;

public class Driver extends Human {
    private int workExperience;
    private String[] drivingCategories;
    public Driver(int age, String name, String familyName, String adress, String ID, int workExperience, String[] drivingCategories) {
        super(age, name, familyName, adress, ID);
        this.drivingCategories = drivingCategories;
        this.workExperience = workExperience;

    }
}
