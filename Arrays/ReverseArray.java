import java.util.Arrays;
public class ReverseArray 
{
	public static void main(String[] args) 
	{
		int [] arr={6,5,4,3,2,1};
		System.out.println(Arrays.toString(f2(arr)));
	}
	static int [] f1(int [] arr){
		 int n=arr.length;
		 int [] ans=new int[n];
		 for(int i=n-1;i>=0;i--){
			ans[n-i-1]=arr[i];
		 }
		 return ans;
	}
	static int [] f2(int [] arr){
		int n=arr.length;
		int start=0;
		int end=n-1;
		while(start<end){
			swap(arr,start,end);
			start++;
			end--;
		}
		return arr;
	}
	static void swap(int [] arr,int start,int end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}

}
