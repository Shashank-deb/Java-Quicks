import java.util.Arrays;
public class Insertion 
{
	//STABLE SORTING ALGORITHM(maintains the position of two equals element  relative to one another)
	//Best for small list 
	//simlar as bubble sort comparison but only difference is we will 
	//have to sort in lhs only make the virtual window of the array
	//i->i-2 start with length or length-1
	//j->reverse of i+1 and having the reverse element
	//swap the element if condition of a[j]<a[j-1] simply swap 
	//otherwise come out and break the condition
	//swapping is less as compare to bubble sorting algorithm
	//every index is sorted and for the window kind of thing for i=0 i+1=1 element index is sorted
	//TIME COMPLEXITY
	//bc-o(n)
	//wc-o(n^2)
	//ac-0(n^2)
	//sc-0(1)
	public static void main(String[] args) 
	{
		int [] arr={45,23,2};
		sort(arr);
		System.out.println(Arrays.toString(arr));	
	}
	static void sort(int [] arr)
	{
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j>0;j--)
			{
				if(arr[j]<arr[j-1])
				{
					swap(arr,j,j-1);	
				}
				else
				{
					break;
				}
			}
		}
	}
	static void swap(int [] arr,int start,int end)
	{
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
