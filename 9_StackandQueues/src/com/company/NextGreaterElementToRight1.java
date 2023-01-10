package com.company;
import java.util.*;

public class NextGreaterElementToRight1 {
    public static void main(String[] args) {
        long[] arr={6,8,0,1,3};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    static long[] nextGreaterElement(long[] arr){
        int n=arr.length;
        long[] result=new long[n];
        Stack<Long> stack=new Stack<>();

        for (int i = n-1; i >=0 ; i--) {
            if(stack.isEmpty()){
                result[i]=-1;
            } else if((!stack.isEmpty()) && (arr[i]<stack.peek())) {
                result[i] = stack.peek();
            } else if((!stack.isEmpty()) && (arr[i]>=stack.peek())){
                while((!stack.isEmpty()) && (arr[i]>=stack.peek())){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i]=-1;
                } else {
                    result[i]=stack.peek();
                }
            }
        stack.push(arr[i]);
        }
        return result;
    }
}
