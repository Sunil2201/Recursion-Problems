package com.Sunil.questions;

public class Duplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicate( "aaaaabbbbb"));
    }
    static String removeDuplicate(String input){
        if(input.length() <= 1){
            return input;
        }
        if(input.charAt(0) == input.charAt(1)){
            return removeDuplicate(input.substring(1));
        }
        return input.charAt(0) +  removeDuplicate(input.substring(1));
    }
}
