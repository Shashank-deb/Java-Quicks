public class Merge 
{

   //STABLE SORTING ALGORITHM(maintains the position of two equals element  relative to one another)
	//This mergesort is used for any type of input wheather it is large or small inputs.
	//but when array not fit into the main memory than we use merge sort algorithm 
	//for larger array and little bit slow because it occupy the space in the main memory
	//but when the size increasing merge sort is perform better not an in place sorting algorithm
	//the main logic of the merge sort is 
	//the merge function 
	//start the i pointer to start to mid
	//start the j pointer to mid+1 to end
	//check the condition in while loop (i<=mid && j<=end)
	//perform the logic 
	//but store the value in the another array at the same size
	//TIME COMPLEXITY 
	//bc-o(nlogn)
	//wc-o(nlogn)
	//ac-o(nlogn)
	//sc-o(n)
	public static void main(String[] args) 
	{
		int [] arr={9,8,7,5,2};
		int n=arr.length;
		System.out.println("Array before sorting: ");
		printArray(arr,n);
		System.out.println("Array after sorting: ");
		mergesort(arr,0,n-1);
		printArray(arr,n);
	}
	//Tc of this mergesort algorithm is o(nlogn)
	static void mergesort(int [] arr,int start,int end)
	{
	  int mid;
	  if(start<end)
		{
			mid=start+(end-start)/2;
			mergesort(arr,start,mid);//this is from start--->mid
			mergesort(arr,mid+1,end);//this is from mid+1--->end
			merge(arr,start,mid,end);
		}
	}


	//Tc of this merge function is o(m+n)
	static void merge(int [] a,int start,int mid,int end)
	{
		int [] b=new int[5];
		int i=start;
		int j=mid+1;
		int k=0;
		while(i<=mid && j<=end)
		{
			if(a[i]<a[j])
			{
				b[k++]=a[i++];
			}
			else
            {
				b[k++]=a[j++];
            }	
		}
		while(i<=mid)
		{
			b[k++]=a[i++];
		}
		while(j<=end)
		{
			b[k++]=a[j++];
		}
		for(int s=end;s>=start;s--)
		{
			a[s]=b[--k];
		}
	}
	static void printArray(int [] arr,int size)
	{
		int i;
		for(i=0;i<size;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
