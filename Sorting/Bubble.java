import java.util.Arrays;
public class Bubble 
{

    //used for finding the maximum element which is always present in the last 
	//of the array at every pass nothing but adjacent sorting algorithm and it 
	//not recommended to used in real life
	//logic is that is i start with 0 and end with n
	//j start with 1 and end with n-i
	//simple comparison is arr[j]<arr[j-1]
	//take the boolean swap
	//then we will simply swap
	//TIME COMPLEXITY
	//best case-o(n)
	//worst case-0(n^2)
	//average case-o(n^2)
	//space -0(1)
	public static void main(String[] args) 
	{
		int [] arr={4,5,1,};
	    sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void sort(int [] arr)
	{
		int n=arr.length;
		boolean swap;
		for(int i=0;i<n;i++)//loop it till n
		{
			swap=false;
			for(int j=1;j<n-i;j++)//loop it from 1 to n-i
			{
				if(arr[j]<arr[j-1])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					swap=true;
				}
			}
				if(!swap)
			  {
			
				break;
			  }
	   }


		
	}
}
