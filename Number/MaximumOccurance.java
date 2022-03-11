//array
class MaximumOccurance 
{
	public static void main(String[] args) 
	{
		int [] arr={2,2,3,5,6};
		int n=arr.length;
		System.out.println(count(arr,n,5));
	}
	static int count(int [] arr,int n,int x)
	{
		int k=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==x)
				k++;

		}
		return k;
	}
}
