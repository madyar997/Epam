package com.company.javaFundamentals;

public class TypeCasting {
    //Повышающее преобразование(разрешенное, неявное)
    int x = 200;
    long y = (long) x;
    long z = x;
    long value1 = (long) 200;

    //Понижающее преобразование
    //Result type has lower range than the original
    long value2 = 1000L;
    int value3 = (int) value2;
    //byte -> short -> int -> long -> double
    //char -> int
    //float -> double
}
