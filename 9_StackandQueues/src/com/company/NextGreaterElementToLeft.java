package com.company;

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElementToLeft {
    public static void main(String[] args) {
        int[] arr={4,2,1,5,3};
        System.out.println(Arrays.toString(nextGreaterElement(arr)));
    }

    static int[] nextGreaterElement(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        Stack<Integer> stack=new Stack<>();

        for (int i = 0; i < n ; i++) {
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
