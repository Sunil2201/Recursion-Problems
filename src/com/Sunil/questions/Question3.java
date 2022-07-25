package com.Sunil.questions;

public class Question3{
    public static void main(String[] args) {
        String str = "sunil Ballani";
        System.out.println(findUpper(str, 0));
    }
    public static char findUpper(String str, int i){
        if(i==str.length()){
            return '\0';
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return findUpper(str, i+1);
    }
}
