import java.util.Arrays;

public class InsertionSortRecursion {
    public static void main(String[] args) {
        int[] arr={ 4, 1, 3, 9, 7};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertionSort(int[] arr){
        helper(arr,0);
    }

    static void helper(int[] arr,int i){
        if(i==arr.length-1){
            return;
        }

        for (int j = i+1; j >0 ; j--) {
            if(arr[j-1]>arr[j]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
            } else {
                break;
            }
        }
        helper(arr,i+1);
    }
}
