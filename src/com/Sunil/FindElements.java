package com.Sunil;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;

public class FindElements {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,18,9,15,18};
        System.out.println(findIndex(arr, 18, 0));
        System.out.println(findAllIndex(arr, 18, 0, new ArrayList<>()));
        System.out.println(findAllIndex2(arr, 18, 0));
    }
    static boolean find(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || find(arr, target, index+1);
    }
    static int findIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if( arr[index] == target){
            return index;
        }else{
            return findIndex(arr, target, index+1);
        }
    }
    static ArrayList<Integer> findAllIndex(int[] arr, int target, int index, ArrayList<Integer> list){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

            return findAllIndex(arr, target, index+1, list);

    }
    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
//        this will contain answer for that function call only
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index+1);

        list.addAll(ansFromBelowCalls);

        return list;
    }
}
