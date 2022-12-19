public class KthBitSetOrNot {
    public static void main(String[] args) {
        int n=61,k=2;
        System.out.println(isSet(n,k));
    }

    static boolean isSet(int n,int k){
        int mask=1<<(k);
        return (n & mask) != 0;
    }
}
