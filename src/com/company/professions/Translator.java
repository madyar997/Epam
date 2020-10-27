package com.company.professions;

import java.util.Date;

public class Translator extends Human{
    private String[] education;
    private String[] languages;

    public Translator(Date dateOfBirth, int age, String name, String familyName, String adress, String ID, String[] education, String[] languages) {
        super(dateOfBirth, age, name, familyName, adress, ID);
        this.education = education;
        this.languages = languages;
    }

    public String[] getEducation() {
        return education;
    }

    public void setEducation(String[] education) {
        this.education = education;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
