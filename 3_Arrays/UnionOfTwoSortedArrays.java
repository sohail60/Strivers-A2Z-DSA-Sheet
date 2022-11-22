import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1={1,35};
        int[] arr2={6, 9, 13, 15, 20, 25, 29, 46};
        System.out.println(union(arr1,arr2));
    }

    static ArrayList<Integer> union(int[] arr1, int[] arr2){
        int n=arr1.length;
        int m=arr2.length;
        int pointer1=0;
        int pointer2=0;
        ArrayList<Integer> list=new ArrayList<>();

        while(pointer1 < n&& pointer2<m){
            if(arr1[pointer1]==arr2[pointer2]){
                if(!list.contains(arr1[pointer1])){
                    list.add(arr1[pointer1]);
                }
                pointer1++;
                pointer2++;
            } else if(arr1[pointer1]>arr2[pointer2]){
                if(!list.contains(arr2[pointer2])){
                    list.add(arr2[pointer2]);
                }
                pointer2++;
            } else {
                if(!list.contains(arr1[pointer1])){
                    list.add(arr1[pointer1]);
                }
                pointer1++;
            }
        }

        while(pointer1<n){
            if(!list.contains(arr1[pointer1])){
                list.add(arr1[pointer1]);
            }
            pointer1++;
        }

        while (pointer2<m){
                if(!list.contains(arr2[pointer2])){
                    list.add(arr2[pointer2]);
                }
                pointer2++;
        }
        return list;
    }
}
