public class TotalSetBitsFrom1toN {
    public static void main(String[] args) {
        int n=4;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(totalSetBits(n));
    }

    static int totalSetBits(int n){
        int count=0;
        for (int i = 1; i <=n ; i++) {
        count=count+setBitsOfEachNumber(i);
        }
        return count;
    }

    static int setBitsOfEachNumber(int n){
        int count=0;

        while(n>0){
            count++;
            n=n&(n-1);
        }
        return count;
    }
}
