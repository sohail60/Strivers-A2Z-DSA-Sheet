import java.util.*;

public class PowerSet {
    public static void main(String[] args) {
    String str="abc";
        System.out.println(powerSet(str));
    }

    static List<String> powerSet(String str){
        List<String> list=new ArrayList<>();
        int n=str.length();
        int powerSize=(int)Math.pow(2,n);

        for (int counter = 0; counter < powerSize; counter++) {
        StringBuilder s=new StringBuilder();
            for (int j = 0; j < n; j++) {
                if((counter&(1<<j))!=0){
                    s.append(str.charAt(n-1-j));
                }
            }
            list.add(s.toString());
        }
        return list;
    }
}