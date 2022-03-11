import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
public class String6 
{
	//input-OPENTEXT
	//output-OPEN1EX2
	public static void main(String[] args) 
	{
		String str="opentext";
		char ch='t';

		if(str.indexOf(ch)==-1)
		{
			System.out.println("Character is not present");
		    System.exit(0);
		}



		//convert string to character 
        char [] arr=str.toCharArray();
		int cnt=1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==ch)//o==t p==t e==t n==t t==t
			{
				arr[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
