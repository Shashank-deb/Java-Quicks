public class LCM 
{
	public static void main(String[] args) 
	{
		int m=12;
		int n=14;
	    System.out.println((m*n)/hcf(m,n));	
	}
	static int hcf(int m,int n)
	{
		while(m!=n)
		{
		   if(m>n)
			   m=m-n;
		   else
			   n=n-m;
		}
		return n;
		
	}
}
