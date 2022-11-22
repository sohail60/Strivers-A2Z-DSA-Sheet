public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr={10,20,20,30,30,40};

        System.out.println(removeDuplicates(arr));
    }

    static int removeDuplicates(int[] arr){
        int n=arr.length;
        int result=0;

        for (int i = 1; i < n; i++) {
            if(arr[i]!=arr[result]){
                arr[result+1]=arr[i];
                result++;
            }
        }
        return result+1;
    }

}
