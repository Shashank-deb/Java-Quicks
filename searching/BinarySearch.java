public class BinarySearch 
{
	//Time complexity=o(logn);
	//space complexity=o(n)
	public static void main(String[] args) 
	{
		int [] arr={34,23,134,55};
		int target=134;
		System.out.println(search(arr,target));
	}
	static int search(int [] arr,int target)
	{
		int start=0;
		int end=arr.length;
		while(start<end)
		{
			int mid=start+(end-start)/2;
			if(target>arr[mid])
				start= mid+1;
			else if(target<arr[mid])
				end= mid-1;
			else
				return mid;
		}
		return -1;
	}
}
