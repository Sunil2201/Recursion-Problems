package com.Sunil.Strings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceFaceList("", 7, 9));
    }
    static void dice(String p, int target){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=6 && i<=target; i++){
            dice(p + i, target-i);
        }
    }
    static void diceFace(String p, int target, int face){
        if(target == 0){
            System.out.println(p);
            return;
        }
        for(int i = 1; i<=face && i<=target; i++){
            diceFace(p + i, target-i, face);
        }
    }
    static ArrayList<String> diceFaceList(String p, int target, int face){
        if(target == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String>list = new ArrayList<>();
        for(int i = 1; i<=face && i<=target; i++){
            list.addAll(diceFaceList(p + i, target-i, face));
        }
        return list;
    }
}
