public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30};

        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr) {
        int n = arr.length;
        int i = 0;

        for (int j = 1; j < n; j++) {
            if (arr[i] != arr[j]){
               i++;
               arr[i]=arr[j];
            }
        }

        return i+1;
    }
}
