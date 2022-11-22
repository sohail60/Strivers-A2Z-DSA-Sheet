import java.util.ArrayList;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1, 2, 3, 4, 5};
        int[] arr2={1, 2, 3};
        System.out.println(intersection(arr1,arr2));
    }

    static ArrayList<Integer> intersection(int[] arr1,int[] arr2){
        ArrayList<Integer> list=new ArrayList<>();

        int n=arr1.length;
        int m=arr2.length;

        int pointer1=0,pointer2=0;

        while(pointer1 < n&& pointer2<m){
            if(arr1[pointer1]==arr2[pointer2]){
                if(!list.contains(arr1[pointer1])){
                    list.add(arr1[pointer1]);
                }
                pointer1++;
                pointer2++;
            } else if(arr1[pointer1]>arr2[pointer2]){
                pointer2++;
            } else {
                pointer1++;
            }
        }
        return list;
    }
}
