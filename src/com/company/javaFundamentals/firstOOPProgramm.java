package com.company.javaFundamentals;
public class firstOOPProgramm{
    public static void main(String[] args) {
        AboutJava object = new AboutJava();
        object.printReleaseData();
    }
}
class AboutJava {
    public void printReleaseData(){
        System.out.println("Java is already here");
    }
}

