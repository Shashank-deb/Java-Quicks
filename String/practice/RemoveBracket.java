public class RemoveBracket 
{
	public static void main(String[] args) 
	{
		 String input1 = "a+((b-c)+d)";
		String input2 = "(((a-b))+c)";
		System.out.println("Original String: "+input1);
		System.out.println("After removing brackets: "+f(input1));
		System.out.println("Original String: "+input2);
		System.out.println("After removing brackets: "+f(input2));
	}
	static String f(String str){
		StringBuilder sb=new StringBuilder();
		int n=str.length();
		for(int i=0;i<n;i++){
			if(str.charAt(i)!='('  &&  str.charAt(i)!=')'){
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
}
