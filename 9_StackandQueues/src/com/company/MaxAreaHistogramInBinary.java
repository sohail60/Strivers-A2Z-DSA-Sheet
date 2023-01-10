package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MaxAreaHistogramInBinary {
    public static void main(String[] args) {
        char[][] arr= {
                {'0','1','1','0'},
                {'1','1','1','1'},
                {'1','1','1','1'},
                {'1','1','0','0'}
        };
        System.out.println(maxAreaInBinary(arr));
    }

    static int maxAreaInBinary(char[][] arr){
        int rows=arr.length;
        int columns=arr[0].length;
        int max=Integer.MIN_VALUE;
        int[] histogram=new int[columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i!=0 && ((arr[i][j]-'0')==0)){
                    histogram[j]=0;
                } else {
                histogram[j]+= (int) (arr[i][j]-'0');
                }
            }
            max=Math.max(max,maxArea(histogram));
        }
        return max;
    }

    static int maxArea(int[] arr){
        int n=arr.length;
        int[] nextSmallerToLeft=new int[n];
        int[] nextSmallerToRight=new int[n];
        Stack<List<Integer>> stack=new Stack<>();
        int max=Integer.MIN_VALUE;

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
            ArrayList<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            list.add(i);
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
            ArrayList<Integer> list=new ArrayList<>();
            list.add(arr[i]);
            list.add(i);
            stack.push(list);
        }

        for (int i = 0; i < n; i++) {
            max=Math.max(max,(nextSmallerToRight[i]-nextSmallerToLeft[i]-1)*arr[i]);
        }
        return max;
    }
}
