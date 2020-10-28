package com.company.javaFundamentals;

import java.util.Date;

public class StrToNum {
    public static void main(String[] args) {
        String strInt = "123";
        String strDouble = "123.23";
        int x;
        double y;
        double z;

        x = Integer.parseInt(strInt);
        y = Double.parseDouble(strDouble);
        System.out.println(x+y);

        strInt = String.valueOf(x+1);
        strDouble = String.valueOf(y+1);
        System.out.println("Strint = " + strInt);
        System.out.println("StrDouble = "+ strDouble);

        String str;
        str = "num = " + 345;
        System.out.println(str);
    }
}
