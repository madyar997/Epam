package com.company.prototype.example_coffee;

public class CoffeeMachine {
    Coffee coffee;

    public CoffeeMachine(Coffee coffee) {
        this.coffee = coffee;
    }
//копия одного обьекта с незав-ой обл-ю памяти
    public Coffee makeCoffee() throws CloneNotSupportedException {
        return this.coffee.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        Coffee coffee = new Coffee("Black");
        Coffee coffee1 = new Cappuchino("Light");
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffee1);
        for(int i=0;i<10;i++){
            System.out.println(coffeeMachine.makeCoffee());

        }
    }

}
