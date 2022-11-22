package com.company;

public class XORAtoB {
    public static void main(String[] args) {
        int a=3,b=9;
        int answer=xor(b)^xor(a-1);
        System.out.println(answer);
    }

    static int xor(int n){
        if(n%4==0){
            return n;
        } else if (n%4==1){
            return 1;
        } else if (n%4==2){
            return n+1;
        } else {
            return 0;
        }
    }
}
