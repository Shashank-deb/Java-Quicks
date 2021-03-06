public class ReverseWord 
{

	//Steps to approach this problem
	//1.for reversing the words we will used the Character which is the wrapper class
	//2.and using the simple two pointer approach
	//3.every step check the character is avaiable or not 
	//4.return new String(ch)
	public static void main(String[] args) 
	{
		String str="abBH-Ynakl";
		System.out.println(reverse(str));
	}
	static String reverse(String str)
	{
		char [] arr=str.toCharArray();
		int n=arr.length;
		int start=0;
		int end=n-1;
		while(start<end)
		{
			while(start<end && !Character.isLetter(str.charAt(start)))
				start++;
			while(start<end && !Character.isLetter(str.charAt(end)))
				end--;
			swap(arr,start,end);
			start++;
			end--;
		}
		return new String(arr);
	}
	static void swap(char [] arr,int start,int end)
	{
		char temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
	}
}
