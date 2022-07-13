import java.util.Arrays;
public class RotatingArray 
{
	//1.reverse array from 0 to n-1;
	//2.reverse array from 0 to k-1;
	//3.reverse array from k to n-1;
	public static void main(String[] args) 
	{
		 int [] arr={1,2,3,4,5,6,7};
		 int k=3;
		 System.out.println(Arrays.toString(f(arr,k)));
	}
	static int  [] f(int [] nums,int k){
		int n=nums.length;
		k=k%n;
		reverse(nums,0,n-1);
		reverse(nums,0,k-1);
		reverse(nums,k,n-1);
		return nums;
	}
	static void reverse(int [] nums,int start,int end){
		while(start<end){
		   int temp=nums[start];
		   nums[start]=nums[end];
		   nums[end]=temp;
		   start++;
		   end--;
		}
		
	}
}
