import java.util.*;

public class ReverseAnArray{
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int t=in.nextInt();

		while(t>0){
			int n=in.nextInt();
			int[] arr=new int[n];

			for (int i=0; i<n; i++) {
				arr[i]=in.nextInt();
			}

			reverse(arr,0,arr.length-1);
			for (int i=0; i<n; i++) {
			System.out.print(arr[i]+" ");
			}
			t--;
		}
	}

	static void reverse(int[] arr,int start,int end){
		if(end<=start){
			return;
		}

		reverse(arr,start+1,end-1);
		swap(arr,start,end);
	}

	static void swap(int[] arr,int first,int second){
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}