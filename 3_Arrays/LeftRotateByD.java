import java.util.Arrays;

public class LeftRotateByD {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int d=2;
        System.out.println(Arrays.toString(arr));
        leftRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    static void leftRotate(int[] arr,int d){
        int n=arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    static void reverse(int[] arr, int start, int end){
        while(end>start){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}
