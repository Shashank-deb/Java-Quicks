public class Palindrome 
{
	public static void main(String[] args) 
	{
		int n=121;
		int m=n;
		int rev=0;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n/=10;
		}
		if(rev==m)
			System.out.println("Number is palindrome");
		else
			System.out.println("Number is not palindrome");
	}
}
