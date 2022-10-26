import java.util.ArrayList;

public class PrintNFibonacciNumbers {
    public static void main(String[] args) {

    }

    public static long[] printFibb(int n) {
        long[] arr=new long[n];
        long fib=0;
        if(n==0 || n==1){
            return 1L;
        }

        arr.add(printFibb(n-1)+printFibb(n-2));
    }
}
