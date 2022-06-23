package com.Sunil;

public class DigitSum {
    public static void main(String[] args) {
        int ans = sum(224567);
        System.out.println(ans);
    }
    static int sum(int n){
        if(n==0){
            return 0;
        }
        return sum(n/10) + (n%10);
    }
}
