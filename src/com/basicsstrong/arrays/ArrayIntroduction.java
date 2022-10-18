package com.basicsstrong.arrays;

public class ArrayIntroduction {

    public static void main(String[] args){


    someMethod(new int[] {1, 2, 3, 12, 46, 43});
    }
    private static void someMethod(int[] arr){
        int total = 0;
        for(int elem: arr){
            total += elem;
        }
        System.out.println(total);
    }
}
