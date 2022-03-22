public class SumOfDigit 
{
	public static void main(String[] args) 
	{
		
      int n=55;
	  int sum=0;
	  while(n>0)
		{
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println("Sum of digit is: "+sum);
	}
}
