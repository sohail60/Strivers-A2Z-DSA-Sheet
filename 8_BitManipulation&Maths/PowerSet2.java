import java.util.ArrayList;
import java.util.List;

public class PowerSet2 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(powerSet(nums));
    }

    static List<List<Integer>> powerSet(int[] arr){
        List<List<Integer>> result=new ArrayList<>();
        int n=arr.length;
        int powerSize=(int)Math.pow(2,n);

        for (int counter = 0; counter < powerSize; counter++) {
        List<Integer> list=new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if((counter&(1<<j))!=0){
                    list.add(arr[j]);
                }
            }
            result.add(list);}
        return result;
    }
}