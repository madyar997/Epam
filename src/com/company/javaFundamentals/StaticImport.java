package com.company.javaFundamentals;
import static java.lang.Math.pow;
import static java.lang.Math.PI;
public class StaticImport {


    public static void main(String[] args) {
        double x;
        int i = 20;
        x = pow(i, 2)* PI;
        System.out.println("x= " + x);
    }
}
