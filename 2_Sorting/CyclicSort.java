import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr={4,1,3,2,5};
        cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cyclicSort(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
        }
    }
}
