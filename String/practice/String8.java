import java.util.Map;
import java.util.HashMap;
class String8 
{
	//count the occurances of the string
	public static void main(String[] args) 
	{
		Map<Character,Integer> map=new HashMap<>();
		String str="programming";
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
			{
				map.put(ch,map.get(ch)+1);
			}
		}
		System.out.println("Occurances is: "+map);
	}
}
