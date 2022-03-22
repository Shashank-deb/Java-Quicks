import java.util.Scanner;
import java.util.Arrays;
public class kthmax 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n: ");
		int n=sc.nextInt();
		int [] arr=new int[n];
		System.out.println("Enter arr: ");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Enter k: ");
		int k=sc.nextInt();
		Arrays.sort(arr);
		System.out.println(k+" :  Highest Element !");
		System.out.println(arr[k-1]);

	}
	
}
