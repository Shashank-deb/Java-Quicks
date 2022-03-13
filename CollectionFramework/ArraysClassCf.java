import java.util.Arrays;
public class ArraysClassCf 
{
	public static void main(String[] args) 
	{
		//Static class
		//Arrays class are used to manipulating 
		//on the primitive data structures know
		//as array
		int a[]={1,2,3,45,67,8,9,10};
		int b[]={10,9,8,67,45,3,2,1};
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));


		//parallel sort
        //when array size is greater than 8192


		Arrays.fill(b,12);
		System.out.println(Arrays.toString(b));

		int index=Arrays.binarySearch(a,3);
		System.out.println("The element present in the index: "+index);
	}
}
