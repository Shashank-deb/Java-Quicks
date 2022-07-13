import java.util.Arrays;
public class SecondSmallestSecondLargest 
{
	public static void main(String[] args) 
	{
		int [] arr={6,5,3,2,1};
		f(arr);
	}
	static void f(int [] arr){
		Arrays.sort(arr);
		int n=arr.length;
		int secondSmallest=arr[1];
		int secondLargest=arr[n-2];
		System.out.println(secondSmallest);
		System.out.println(secondLargest);
	}
}
