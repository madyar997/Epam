package com.company.professions;

import java.awt.event.WindowStateListener;
import java.util.Date;

public class Musician extends Human{
    private String education;
    private String instrument;
    private int experience;

    public Musician(int age, String name, String familyName, String adress, String ID, String education, String instrument, int experience){
        super(age, name, familyName, adress, ID);
        this.education = education;
        this.instrument = instrument;
        this.experience = experience;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getInstrument() {
        return instrument;
    }

    public void setInstrument(String instrument) {
        this.instrument = instrument;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
