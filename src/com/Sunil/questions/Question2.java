package com.Sunil.questions;

public class Question2 {
    public static int findMinRec(int[] arr, int n){
        if(arr.length == 1){
            return arr[0];
        }
        return Math.min(arr[(arr.length)-1], findMinRec(arr, n-1));
    }
}
