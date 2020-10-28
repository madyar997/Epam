package com.company.metanit_gl3.perechisleniya;

import org.w3c.dom.ls.LSOutput;

public class Program {

    public static void main(String[] args) {
        System.out.println(Color.BLUE.getCode());
        System.out.println(Color.RED.getCode());
    }
}
//Перечисление COlor определяе приватное поле cod для хранеия кода цвета , а с помощью метода
// getCode Оно возвращается Через конструктор передается для него значение.
enum Color {
    RED("#FF0000"),
    BLUE("#0000FF"),
    GREEN("#00FF00");
    private String code;

    Color(String code) {
        this.code = code;
    }
    public String getCode()
    {
        return code;
    }
}