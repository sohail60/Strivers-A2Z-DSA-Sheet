import java.util.*;

public class SieveForPrimeFactorisation {
    public static void main(String[] args) {
        System.out.println(primeFactors(4));
    }

    static List<Integer> primeFactors(int n){
        List<Integer> list=new ArrayList<>();
        boolean[] isPrime=new boolean[n+1];

        for (int i = 2; i <=n ; i++) {
            if (!isPrime[i]){
                int x=n;
                while(x%i==0){
                    list.add(i);
                    x=x/i;
                }
                for (int j = 2*i; j <=n ; j=j+i) {
                    isPrime[j]=true;
                }
            }
        }
        return list;
    }
}
