import java.util.Map;
import java.util.HashMap;
class String8 
{
	//count the occurances
	public static void main(String[] args) 
	{
		String input="hello";
		char [] arr=input.toCharArray();
		Map<Character,Integer> map=new HashMap<>();
		for(char ch:arr)
		{
			if(!map.containsKey(ch))
			{
			map.put(ch,1);
			}
			else
			{
				map.put(ch,map.get(ch)+1);
			}
		}
		System.out.println(map);
	}
}
