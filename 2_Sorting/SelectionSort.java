import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={4, 1, 3, 9, 7};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        int n=arr.length;

        for (int i = 0; i < n-1; i++) {
            int end=n-1-i;
            int maxIndex=maxIndex(arr,end);
            swap(arr,maxIndex,end);
        }
    }

    static int maxIndex(int[] arr, int end) {
        int maxIndex=0;
        for (int i = 0; i <= end; i++) {
            if(arr[i]>arr[maxIndex]){
                maxIndex=i;
            }
        }
        return maxIndex;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}