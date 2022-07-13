import java.util.Arrays;
public class FindMedian 
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 7, 1, 2, 5, 6};
		f(arr);
	}
	static void f(int [] arr){
		Arrays.sort(arr);
		int n=arr.length;
		if(n%2==0){
			int index1=(n/2)-1;
			int index2=n/2;
			System.out.println((double)(arr[index1]+arr[index2])/2);
		}
		else{
			System.out.println(arr[(n/2)]);
		}
	}
}
