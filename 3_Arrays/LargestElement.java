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


}
