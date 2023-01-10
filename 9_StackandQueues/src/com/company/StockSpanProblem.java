package com.company;
import java.security.KeyPair;
import java.util.*;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr={100,80,60,70,60,75,85};
        System.out.println(Arrays.toString(stockSpan(arr)));
    }

    static int[] stockSpan(int[] arr){
        int n=arr.length;
        int[] result=new int[n];
        Stack<List<Integer>> stack=new Stack<>();

        for (int i = 0; i < n ; i++) {
            if(stack.isEmpty()){
                result[i]=i-(-1);
            } else if((!stack.isEmpty()) && (arr[i]<stack.peek().get(0))) {
                result[i] = i-(stack.peek().get(1));
            } else if((!stack.isEmpty()) && (arr[i]>=stack.peek().get(0))){
                while((!stack.isEmpty()) && (arr[i]>=stack.peek().get(0))){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    result[i]=i-(-1);
                } else {
                    result[i]=i-(stack.peek().get(1));
                }
            }
            ArrayList<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            list.add(i);
            stack.push(list);
        }
        return result;
    }
}