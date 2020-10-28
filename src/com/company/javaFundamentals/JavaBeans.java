package com.company.javaFundamentals;
//Bean - программный компонент, который будет использоваться многократно
//Bean это обьект , который пишут один раз и будут использовать многократно
//состоит из свойств, методов и собыйтий

import java.awt.*;

public class JavaBeans {
}
class BeanExample {
    private Color color;
    private double data[];

    public double getData(int index) {
        return data[index];
    }
    public void setData(int index, double data){
        this.data[index] = data;
    }
    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public void setColor(Color newColor){
        color = newColor;
    }

    public Color getColor() {
        return color;
    }
}
