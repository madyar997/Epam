package com.company.metanit_gl3.generics;

public class Generics {
    public static void main(String[] args) {
    Account<String> acc1 = new Account<String>("2345",5000);
    String acc1Id = acc1.getId();
    System.out.println(acc1Id);

    Account<Integer> acc2 = new Account<Integer>(2345, 5000);
    Integer acc2Id = acc2.getId();
    System.out.println();
    }
}

//Данный тип Т будет использоваться этим классом
//Вместо Т можно подставить любой тип.
class Account<T> {
    private T id;
    private int sum;

    public Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
