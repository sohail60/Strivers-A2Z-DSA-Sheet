public class SumofFirstNnumbers {
    public static void main(String[] args) {
        System.out.println(sum(5));
    }

    static long sum(long n){
        if(n==1){
            return 1;
        }

        return n*n*n+sum(n-1);
    }
}
