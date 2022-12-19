public class PowerOf2 {
    public static void main(String[] args) {
        int n=64;
        System.out.println(isPowerOfTwo(n));
    }

    static boolean isPowerOfTwo(int n){
        return (n & (n-1))==0;
    }
}
