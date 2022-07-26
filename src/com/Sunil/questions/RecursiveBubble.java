package com.Sunil.questions;

import java.util.Arrays;

public class RecursiveBubble {
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};

        bubble(arr, arr.length);

        System.out.println("Sorted array : ");
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr, int n){
        if(n==1){
            return;
        }
        for(int i=0; i<n-1; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
            }
        }
        bubble(arr, n-1);
    }
}
