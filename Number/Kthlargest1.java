import java.util.Scanner;
import java.util.Arrays;
public class Kthlargest1 
{
	public static void main(String[] args) 
	{
		
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the value of n: ");
     int n=sc.nextInt();
     System.out.println("Enter the value of arr: ");
     int [] arr=new int[n];
     for(int i=0;i<n;i++)
      arr[i]=sc.nextInt();
	   System.out.println("Enter the value of k: ");
       int K=sc.nextInt();
         Arrays.sort(arr);
		 System.out.println(" Highest Number");
        System.out.println(arr[K-1]);
	}
}
