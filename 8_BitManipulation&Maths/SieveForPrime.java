public class SieveForPrime {
    public static void main(String[] args) {
        int n=2;
        System.out.println(sieveForPrime(n));
    }
//Return the number of primes nos till n
    static int sieveForPrime(int n){
        boolean[] isPrime=new boolean[n+1];
        int counter=0;
        for (int i = 2; i <n ; i++) {       // Strictly less than n (For n=2, the answer will be 0;)
            if(!isPrime[i]){
                counter++;
                for (int j = 2*i; j <=n ; j=j+i) {
                    isPrime[j]=true;
                }
            }
        }
        return counter;
    }
}
