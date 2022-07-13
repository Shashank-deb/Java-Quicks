import java.util.Arrays;
public class SmallestNumber 
{
	public static void main(String[] args) 
	{ 
		int [] arr={6,7,3,2,1};
		System.out.println(f(arr));
	}
	static int f(int [] arr){
       Arrays.sort(arr);
	   return arr[0];
	}
}
