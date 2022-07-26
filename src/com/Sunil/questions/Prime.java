package com.Sunil.questions;

public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(99, 2));
    }
    static boolean isPrime(int n, int i){
        if(n <= 2){
            return n == 2;
        }
        if(n % i == 0){
            return false;
        }
        if(i*i > n){
            return true;
        }
        return isPrime(n, i+1);
    }
}
