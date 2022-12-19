public class OddOrEven {
    public static void main(String[] args) {

    }

    static String oddOrEven(int n){
        if((n&1)==1){
            return "odd";
        } else {
            return "even";
        }
    }
}
