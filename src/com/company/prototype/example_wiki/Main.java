package com.company.prototype.example_wiki;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        Cookie prototype = new CoconutCookie();
        CookieMachine cookieMachine = new CookieMachine(prototype);
        for(int i = 0; i < 10; i++){
            tempCookie = cookieMachine.makeCookie();
            System.out.println(tempCookie);
        }
    }
}
