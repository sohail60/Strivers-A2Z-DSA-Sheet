import java.util.ArrayList;
import java.util.List;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        System.out.println(swap(10,15));
    }

    static List<Integer> swap(int a,int b){
        List<Integer> list=new ArrayList<>();

        a=a^b;
        b=a^b;
        a=a^b;
        list.add(a);
        list.add(b);
        return list;
    }
}
