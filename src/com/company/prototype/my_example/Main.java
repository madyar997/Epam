package com.company.prototype.my_example;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        WritingStuff tempPen;
        WritingStuff prototype = new Pen();
        WritingStuffMachine writingStuffMachine = new WritingStuffMachine(prototype);
        for(int i = 0;i<10;i++){
            tempPen = writingStuffMachine.makeWritingStuff();
            System.out.println(tempPen);
        }
    }
}
