import java.util.Arrays;
import java.util.Scanner;
class Kthlargest3 
{
	public static void main(String[] args) 
	{
		int [] arr={7,5,4,3};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int [] arr){
		int n=arr.length;
		boolean isSwap=false;
		for(int i=0;i<n;i++){
			for(int j=1;j<n-i;j++){
				if(arr[j]<arr[j-1]){
					swap(arr,j,j-1);
					isSwap=true;
				}
			}
			if(!isSwap){
				break;
			}
		}
	
		
	}
	static void swap(int [] arr,int start,int end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
