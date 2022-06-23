package com.Sunil;

public class DigitProd {
    public static void main(String[] args) {
        int ans = prod(1234);
        System.out.println(ans);
    }
    static int prod(int n){
        if(n%10==n){
            return n;
        }
        return prod(n/10) * (n%10);
    }
}
