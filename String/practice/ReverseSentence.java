public class ReverseSentence 
{
	//this programme is used for reversing each words in java
	//steps to approach this problem
	//1.spilt the spaces  and store in the String array words
	//2.maintain the StringBuilder to store the reverse sentence
	//3.reverse the letter by appending the word in the given StringBuilder
	//4.at last return the answerz
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
