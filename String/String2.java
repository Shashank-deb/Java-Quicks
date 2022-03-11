public class String2 
{
	public static void main(String[] args) 
	{
		String str="#$#@%@#%$Jav@a";
		String reverse=str.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(reverse);
	}
}
