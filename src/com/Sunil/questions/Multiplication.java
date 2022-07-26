package com.Sunil.questions;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println(multiply(100,5));
    }
    static int multiply(int x, int y){
        if(y==0){
            return 0;
        }
        return ( x + multiply(x, y-1));
    }
}
