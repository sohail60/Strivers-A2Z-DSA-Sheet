import java.util.Arrays;

public class SecondLargest {
    public static void main(String[] args) {
        int[] arr= {35,35,35,34};
        System.out.println(secondLargest2(arr));
    }

    static int secondLargest1(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        for (int i = n-1; i >=0 ; i--) {
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }

    static int secondLargest2(int[] arr){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if(arr[i]>=secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }

        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }

    static int secondLargest3(int[] arr){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            if(arr[i]>=max){
                max=arr[i];
            }

            if(arr[i]>=secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }


        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }

    static int secondLargest4(int[] arr){

        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
            else if(arr[i]>secondMax && arr[i]!=max){
                secondMax=arr[i];
            }
        }

        if(secondMax==Integer.MIN_VALUE){
            return -1;
        }
        return secondMax;
    }
}
