public class DivideTwoNumbers {
    public static void main(String[] args) {
        int a=105,b=6;
        System.out.println(divide(a,b));
    }

    static Long divide(int dividend,int divisor){
        int sign=(dividend<0)^(divisor<0)?-1:1;
        long temp=0L,quotient=0L;

        dividend=Math.abs(dividend);
        divisor=Math.abs(divisor);

        for (int i = 31; i >=0 ; i--) {
            if(temp+((long) divisor <<i)<=dividend){
                temp=temp+dividend<<i;
                quotient+=1L<<i;
            }
        }

        if(sign==-1){
            quotient=quotient*-1;
        }
        return quotient;
    }
}
