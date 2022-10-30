import java.util.*;
public class LargestElement {

    public static void main(String[] args) {
        int[] arr={1, 8, 7, 56, 90};
        System.out.println(largest(arr));
    }

    public static int largest(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

//    static void sort(int[] arr){
//        int start=0,end=arr.length-1;
//
//        while(end>=start){
//            int temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//    }
}
