import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class FindAllMissingNumber 
{
	
    static List<Integer> sort(int [] arr)
	{
		int i=0;
		int n=arr.length;
		while(i<n)
		{
			int correct_index=arr[i]-1;
			if(arr[i]!=arr[correct_index])
			{
				swap(arr,i,correct_index);
			}
			else
			{
				i++;
			}
		}
		List<Integer> ans=new ArrayList<>();
		for(int index=0;index<arr.length;index++)
		{
			if(arr[index]!=index+1)
			{
				ans.add(index+1);
			}
		}
		return ans;
	}
	static void swap(int [] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
