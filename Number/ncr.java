class ncr 
{
	public static void main(String[] args) 
	{
       System.out.println(ncr(3,2));
	}
	static int ncr(int n,int r)
	{
		return fact(n)/fact(r)*fact(n-r);
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
