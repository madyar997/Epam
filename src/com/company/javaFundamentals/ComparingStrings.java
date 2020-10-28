package com.company.javaFundamentals;
//пул литералов - коллекция ссылок на строковые объекты.

public class ComparingStrings {
    public static void main(String[] args) {
        String s1, s2;
        s1 = "Java";
        s2 = "java";
        System.out.println("Cравнение ссылок "+ (s1 == s2));
        s1 += "2";
        s2 = new String(s1);
        System.out.println("Cравнение ссылок "+ (s1==s2));
        System.out.println("Cравнение значений "+ s1.equals(s2));
    }
}
