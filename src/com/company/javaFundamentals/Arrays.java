package com.company.javaFundamentals;

public class Arrays {
    public static void main(String[] args) {
        int[] price = new int[10];
        int[] rooms = new int[]{ 1,2,3,4 };
        FindMax findMax = new FindMax();
        findMax.findMax(rooms);
    }
}
class FindMax{
    private int max;
    public int findMax(int[] array){
        max = array[0];
        for(int i = 0; i < array.length; i++){
            if (array[i] > max) max = array[i];

        }
        System.out.println("Max = "+ max);
        for(int x:array) {
            System.out.println(x + " ");
        }
        return max;
    }
}
