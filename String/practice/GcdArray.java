public class GcdArray 
{
	public static void main(String[] args) 
	{
	  int [] arr={2, 4, 6, 8, 16};
	  int n=arr.length;
	  System.out.println("The gcd of the given array is: ");
      System.out.println(findGcd(arr,n));
	}
	static int gcd(int a ,int b)
	{
		if(a==0)
			return b;
		return gcd(b%a,a);
	}
	static int findGcd(int [] arr,int n)
	{
		int number=arr[0];
		for(int element:arr)
			number=gcd(element,number);
		if(number==1)
		{
	      		return 1;		
		}
		return number;
	
	}
}
