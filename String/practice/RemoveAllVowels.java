public class RemoveAllVowels 
{
	public static void main(String[] args) 
	{
		String s="take u forward";
		System.out.println("Removing all vowels in given string is: "+RemoveVowels(s));
	}
	 public static String RemoveVowels(String str) {
			for (int i = 0; i < str.length(); i++) {
			  if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
				str = str.substring(0, i) + str.substring(i + 1);
				i--;
			  }
		}
			return str;
   }
}
