package com.company.metanit_gl3.generics;

public class Obobshenniy_interfeisy {

}
interface Accountable<T>{
    T getID();
    int getSum();
    void setSum(int sum);
}
//Жесткая привязка к классу
class Account1 implements Accountable<String>{

    private String id;
    private int sum;

    @Override
    public String getID() {
        return id;
    }

    @Override
    public int getSum() {
        return sum;
    }

    @Override
    public void setSum(int sum) {
        this.sum = sum;
    }
}
