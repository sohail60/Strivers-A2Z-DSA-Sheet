package com.company;
import java.util.*;

public class MaximunAreaHistrogram {
    public static void main(String[] args) {
        long[] arr={2,4};
        System.out.println((maxArea(arr)));
    }

    static long maxArea(long[] arr){
        int n=arr.length;
        long[] nextSmallerToLeft=new long[n];
        long[] nextSmallerToRight=new long[n];
        Stack<List<Long>> stack=new Stack<>();
        long max=Integer.MIN_VALUE;

        for (int i = 0; i < n ; i++) {
            if(stack.isEmpty()){
                nextSmallerToLeft[i]=-1;
            } else if((!stack.isEmpty()) && (arr[i]>stack.peek().get(0))) {
                nextSmallerToLeft[i] =stack.peek().get(1);
            } else if((!stack.isEmpty()) && (arr[i]<=stack.peek().get(0))){
                while((!stack.isEmpty()) && (arr[i]<=stack.peek().get(0))){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    nextSmallerToLeft[i]=-1;
                } else {
                    nextSmallerToLeft[i]=stack.peek().get(1);
                }
            }
            ArrayList<Long> list=new ArrayList<>();
            list.add(arr[i]);
            list.add((long) i);
            stack.push(list);
        }
        stack.clear();
        for (int i = n-1; i >= 0 ; i--) {
            if(stack.isEmpty()){
                nextSmallerToRight[i]=n;
            } else if((!stack.isEmpty()) && (arr[i]>stack.peek().get(0))) {
                nextSmallerToRight[i] = stack.peek().get(1);
            } else if((!stack.isEmpty()) && (arr[i]<=stack.peek().get(0))){
                while((!stack.isEmpty()) && (arr[i]<=stack.peek().get(0))){
                    stack.pop();
                }
                if(stack.isEmpty()){
                    nextSmallerToRight[i]=n;
                } else {
                    nextSmallerToRight[i]=stack.peek().get(1);
                }
            }
            ArrayList<Long> list=new ArrayList<>();
            list.add(arr[i]);
            list.add((long)i);
            stack.push(list);
        }

        for (int i = 0; i < n; i++) {
            max=Math.max(max,(nextSmallerToRight[i]-nextSmallerToLeft[i]-1)*arr[i]);
        }
        return max;
    }
}
