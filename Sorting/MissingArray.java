import java.util.Arrays;
public class CyclicSort1 
{
	//The range of an array is 0-n so correct_index=element
	public static void main(String[] args) 
	{
		int [] nums={4,0,2,1};
		sort(nums);
	}
	static void sort(int [] arr)
	{
		int i=0;
		int n=arr.length;
		while(i<n)
		{
			int correct=arr[i];
			if(arr[i]<n && arr[i]!=arr[correct])
			{
				swap(arr,i,correct);
			}
			else
			{
				i++;
			}
		}
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index)
			{
				System.out.println("Missing Element in array is: "+index);
			}
		}
		
	}
	static void swap(int [] arr,int first ,int second)
	{
		int temp=arr[first];
		arr[first]=arr[second];
		arr[second]=temp;
	}
}
