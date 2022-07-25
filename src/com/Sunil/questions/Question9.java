package com.Sunil.questions;

public class Question9 {
    public static void main(String[] args) {
        String str = "Sunil Ballani";
        System.out.println(strLength(str));
    }
    static int strLength(String str){
        if(str.equals("")){
            return 0;
        }
        return 1 + strLength(str.substring(1));
    }
}
