import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr={1, 4, 3};
        System.out.println(missingNumber3(arr,4));
    }

    static int missingNumber1(int[] arr, int n){
        int l=arr.length;
        int xor=0;

        for (int i = 1; i <= n; i++) {
            xor^=i;
        }

        for (int i=0;i<l;i++){
            xor^=arr[i];
        }
        return xor;
    }

    static int missingNumber2(int[] arr ,int n){
        int l=arr.length;

        int sum=n*(n+1)/2;

        for (int i = 0; i < l; i++) {
            sum-=arr[i];
        }
        return sum;
    }

    static int missingNumber3(int[] arr,int n){
        int l=arr.length;
        Arrays.sort(arr);

        for (int i = 0; i < l; i++) {
            if(arr[i]!=i+1){
                return i+1;
            }
        }
        return -1;
    }
}
