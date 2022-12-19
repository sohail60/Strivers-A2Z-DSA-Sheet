public class SetRightMostUnsetBit {
    public static void main(String[] args) {
        int n=6;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(set(n));
    }

    static int set(int n){
        int a=n,count=0;

        while(a>0){
            if((a&1)==0){
                int mask=1<<count;
                n=n|mask;
                break;
            }
            a=a>>1;
            count++;
        }
        return n;
    }
}
