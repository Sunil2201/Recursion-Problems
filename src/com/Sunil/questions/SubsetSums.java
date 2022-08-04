package com.Sunil.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class SubsetSums {

    public static void main(String[] args) {
        int N = 3;
        int[] arr = {5, 2, 1};
        System.out.println(subsetSums(arr, N));
    }


    static ArrayList<Integer> subsetSums(int[] arr, int N){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>());

        for(int num : arr){
            int n = outer.size();
            for(int i = 0; i < n; i++){
                List<Integer> internal = new ArrayList<>(outer.get(i)); // copying the elements of outer arraylist
                internal.add(num);
                System.out.println(internal);
                outer.add(internal);
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(List<Integer> list : outer){
            int sum = 0;
            for(int num : list){
                sum = sum+num;
            }
            ans.add(sum);
        }
        Collections.sort(ans);
        return ans;
    }
}
