import java.util.ArrayList;
import java.util.Arrays;

public class PrimeFactors {
    public static void main(String[] args) {
        int n=100;
        System.out.println(Arrays.toString(primeFactors(n)));
    }

    static int[] primeFactors(int n){
        ArrayList<Integer> list=new ArrayList<>();
        int counter=0;
        for (int i = 2; i*i<=n ; i++) {
        while(n%i==0){
            if(!list.contains(i)){
            list.add(i);
            counter++;
            }
            n=n/i;
        }
        }
        if(n>1){
            if(!list.contains(n)){
            list.add(n);
            counter++;
            }
        }

        int i=0;
        int[] result=new int[counter];
        for (int item : list){
            result[i]=item;
            i++;
        }
        return result;
    }
}
