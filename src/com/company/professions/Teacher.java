package com.company.professions;

import java.util.Date;

public class Teacher extends Human{
    private String[] education;
    private String[] subject;
    private int category;
    private int experience;

    public Teacher(int age, String name, String familyName, String adress, String ID, int category, int experience, String[] education) {
        super(age, name, familyName, adress, ID);
        this.category = category;
        this.experience = experience;
        this.education = education;
    }


    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String[] getSubject() {
        return subject;
    }

    public void setSubject(String[] subject) {
        this.subject = subject;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
