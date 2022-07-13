import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
public class FindAllDuplicate 
{
	//the range of this input is 1 to n
	public static void main(String[] args) 
	{
		int [] arr={1,3,4,2,2};
		findDuplicates(arr);
	}
	 static  List<Integer> findDuplicates(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n)
        {
            int correct=nums[i]-1;
            if(  nums[i]!=nums[correct])
            {
                swap(nums,i,correct);
            }
            else
            {
                i++;
            }
        }
        List<Integer> ans=new ArrayList<Integer>();
        for(int index=0;index<nums.length;index++)
        {
            if(nums[index]!=index+1)
            {
                ans.add(nums[index]);
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
