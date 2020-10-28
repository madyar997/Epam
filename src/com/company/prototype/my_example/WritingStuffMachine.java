package com.company.prototype.my_example;

public class WritingStuffMachine {
    WritingStuff writingStuff;

    public WritingStuffMachine(WritingStuff writingStuff) {
        this.writingStuff = writingStuff;
    }
    public WritingStuff makeWritingStuff() throws CloneNotSupportedException {
        return this.writingStuff.clone();
    }
}
