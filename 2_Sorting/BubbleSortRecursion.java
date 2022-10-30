import java.util.Arrays;

public class BubbleSortRecursion {
    public static void main(String[] args) {
        int[] arr={4, 1, 3, 9, 7};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        helper(arr,0);
    }

    static void helper(int[] arr,int i){
        int n=arr.length;
        int flag=0;
        if(i==n-1){
            return;
        }

        for (int j = 0; j < n-1-i; j++) {
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                flag=1;
            }
        }

        if(flag==0){
            return;
        }

        helper(arr,i+1);
    }
}
