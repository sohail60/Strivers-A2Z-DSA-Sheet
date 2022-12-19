import java.util.Arrays;

public class TwoOddAppearances {
    public static void main(String[] args) {
        int[] arr={1, 7, 5, 7, 5, 4, 7, 4};
        System.out.println((Arrays.toString(oddAppearances(arr))));
    }

    static int[] oddAppearances(int[] arr){
        int n=arr.length;
        int xor=0,res1=0,res2=0;
        int[] result=new int[2];

        for (int i = 0; i < n; i++) {
            xor=xor^arr[i];
        }

//        Finding rightmost set bit
        int rightMostSetBit=xor&~(xor-1);

        for (int i = 0; i < n; i++) {
        if ((rightMostSetBit&arr[i])!=0){
            res1=res1^arr[i];
        } else {
            res2=res2^arr[i];
        }
        }
        result[0]=Math.max(res1,res2);
        result[1]=Math.min(res1,res2);
        return result;
    }
}
