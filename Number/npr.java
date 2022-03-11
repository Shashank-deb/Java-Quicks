public class npr 
{
	public static void main(String[] args) 
	{
		System.out.println(npr(10,2));
    }
	static int npr(int n,int r)
	{
		return fact(n)/fact(n-r);
	}
	static int fact(int n)

	{
		int fac=1;
		for(int i=1;i<=n;i++)
		{
			fac*=i;
		}
		return fac;
	}
}
