public class ExceptionallyOdd {
    public static void main(String[] args) {
        int[] arr={1, 2, 3, 2, 3, 1, 3};
        System.out.println(oddAppearances(arr));
    }

    static int oddAppearances(int[] arr){
        int n=arr.length;
        int xor=0;
        for (int item:arr){
            xor^=item;
        }
        return xor;
    }
}
