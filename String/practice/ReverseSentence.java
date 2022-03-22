public class ReverseSentence 
{
	public static void main(String[] args) 
	{
		 String str="iam a programmer";
		 System.out.println(reverse(str));	 
	}
	static String reverse(String str)
	{
   		 String [] words=str.split(" ");
		 StringBuilder sb=new StringBuilder();
		 for(String word:words)
		{
			sb.append(new StringBuffer(word).reverse().toString()+" ");
		}
		 
		 return sb.toString().trim();
	}
}
