import java.util.Arrays;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr= {15 ,12 ,0 ,0 ,0 ,2 ,2 ,19 ,6, 17 ,16 ,20 ,0 ,2 ,16 ,0 ,10 ,0 ,14, 15};
        move2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void move1(int[] arr){
        int n=arr.length;

        for (int i = 0; i <n ; i++) {
            if (arr[i]==0){
                for (int j = i+1; j < n; j++) {
                    if(arr[j]!=0){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    break;
                    }
                }
            }
        }
    }

    static void move2(int[] arr){
        int n=arr.length;
        int count=0;

        for (int i = 0; i <n ; i++) {
            if (arr[i]!=0){
                        int temp=arr[i];
                        arr[i]=arr[count];
                        arr[count]=temp;
                        count++;
                }
            }
        }
    }