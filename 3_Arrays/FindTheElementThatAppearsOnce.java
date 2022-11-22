public class FindTheElementThatAppearsOnce {
    public static void main(String[] args) {
        int[] arr={2, 2, 5, 5, 20, 30, 30};
        System.out.println(appearOnce(arr,5));
    }

    static int appearOnce(int[] arr,int n){
        int start=0,end=n-1;

        while (end>start){
            int mid=(start+end)/2;
            if(mid%2==0){
                if(arr[mid]==arr[mid+1]) {
                    start = mid;
                } else {
                    end=mid;
                }
            } else {
                if(arr[mid]!=arr[mid+1]){
                    start=mid+1;
                } else {
                    end=mid;
                }
            }
        return mid;
        }
        return -1;
    }
}
