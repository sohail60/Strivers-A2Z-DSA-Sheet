import java.util.ArrayList;

public class Factorials {
    public static void main(String[] args) {
        System.out.println(factorialNumbers(3));
    }

    static ArrayList<Long> factorialNumbers(long n){
        ArrayList<Long> list=new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if(fact(i)<=n){
            list.add(fact(i));
            }
        }
        return list;
    }

    static Long fact(int n){
        if(n==1){
            return 1L;
        }

        return n*fact(n-1);
    }
}
