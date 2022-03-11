public class SecondMax
{
	public static  void main(String[] args)
	{
		int[] arr = {4,5,8};
		if(arr.length == 0)
			System.out.println("no element found ");
		else
		{
			int currMax = 0;
		    int secMax = -1;
			int secondMax = findSecMax(arr, currMax, secMax);
			if(secondMax == -1)
				System.out.println("single element present in array");
			else
				System.out.println(arr[secondMax]);
		}
	}



	// secondMax Function
	public static int findSecMax(int[] arr, int currMax, int secMax)
	{
		int n = arr.length;
		for(int i = 1; i<n-1; i++)
		{
			if(arr[i] < arr[i+1])
			{
				int temp = currMax;
				currMax = arr[i+1];
				secMax = temp;
			}
		}
		return secMax;
	}
}