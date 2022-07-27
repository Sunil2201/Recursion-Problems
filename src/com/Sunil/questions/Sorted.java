package com.Sunil.questions;

public class Sorted {
    public static void main(String[] args) {
        int arr[] = { 20, 20, 78, 98, 99, 97 };
        int n = arr.length;
        System.out.println(isSorted(arr, n));
    }
    static boolean isSorted(int[] arr, int n){
        if(n<=1){
            return true;
        }
        int max = arr[n-1];
        for(int i=0; i<n-1; i++){
            if(arr[i] > max){
                return false;
            }
        }
        return isSorted(arr, n-1);
    }
}
