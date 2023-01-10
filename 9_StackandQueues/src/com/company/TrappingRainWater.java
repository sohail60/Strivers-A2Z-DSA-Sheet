package com.company;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr={3,0,0,2,0,4};
        System.out.println(rainWater2(arr));
    }

    static int rainWater(int[] arr){
        int n=arr.length;
        int water=0;
        for (int i = 1; i < n-1; i++) {
            int min=Math.min(max(arr,0,i-1),max(arr,i+1,n-1));
            if(min-arr[i]>0){
            water+=min-arr[i];
            }
        }
        return water;
    }

    static int max(int[] arr,int s,int e){
        int max=Integer.MIN_VALUE;

        for (int i = s; i <=e ; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }

    static int rainWater2(int[] arr){
        int n=arr.length;
        int water=0;

        int maxToLeft=arr[0];
        int[] maxToLeftArray=new int[n];
        maxToLeftArray[0]=maxToLeft;
        int maxToRight=arr[n-1];
        int[] maxToRightArray=new int[n];
        maxToRightArray[n-1]=maxToRight;

        for (int i = 1; i < n; i++) {
            maxToLeftArray[i]=maxToLeft;
            if(arr[i]>maxToLeft){
                maxToLeft=arr[i];
            }
        }

        for (int i = n-2; i >= 0; i--) {
            maxToRightArray[i]=maxToRight;
            if(arr[i]>maxToRight){
                maxToRight=arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            int min=Math.min(maxToLeftArray[i],maxToRightArray[i]);
            if(min-arr[i]>0){
                water+=min-arr[i];
            }
        }
        return water;
    }
}
