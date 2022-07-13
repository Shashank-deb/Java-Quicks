import java.util.Arrays;
public class LargestNumber 
{
	public static void main(String[] args) 
	{
	   int [] arr={7,7,4,23,2};
	   System.out.println(f(arr));
	}
	static int f(int [] arr){
		Arrays.sort(arr);
		int n=arr.length;
		return arr[n-1];
	}
}
