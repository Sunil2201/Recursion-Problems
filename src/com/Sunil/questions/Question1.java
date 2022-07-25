package com.Sunil.questions;

import java.util.Arrays;

public class Question1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        printTriangle(arr);
    }

    public static void printTriangle(int[] arr){
        if(arr.length < 1){
            return;
        }

        int[] temp = new int[arr.length-1];
        for(int i=0; i< arr.length-1; i++){
            temp[i] = arr[i] + arr[i+1];
        }

        printTriangle(temp);
        System.out.println(Arrays.toString(temp));
    }
}
