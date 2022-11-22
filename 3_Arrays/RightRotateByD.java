import java.util.Arrays;

public class RightRotateByD {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 4, 5, 6, 7};
        int d=2;
        System.out.println(Arrays.toString(arr));
        rightRotate(arr,d);
        System.out.println(Arrays.toString(arr));
    }

    static void rightRotate(int[] arr,int d){
        int n=arr.length;
        d=d%n;
        int k=n-d;

        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
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
