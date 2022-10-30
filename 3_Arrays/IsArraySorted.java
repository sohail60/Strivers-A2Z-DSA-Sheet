public class IsArraySorted {
    public static void main(String[] args) {
        int[] arr= {90, 80, 100, 70, 40, 30};

        System.out.println(isSorted2(arr));
    }

    static boolean isSorted1(int[] arr){
        int n= arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }
        return true;
    }

    static boolean isSorted2(int[] arr){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
