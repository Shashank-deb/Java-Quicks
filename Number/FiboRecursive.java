class FiboRecursive 
{
	public static void main(String[] args) 
	{
		System.out.println(f(6));
	}
	static int f(int n){
		if(n<=1)
			return n;
		int first=f(n-1);
		int second=f(n-2);
		return first+second;
	}
}
