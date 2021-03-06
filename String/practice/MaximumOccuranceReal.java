import java.util.HashMap;
import java.util.Map;
public class MaximumOccuranceReal 
{
	public static void main(String[] args) 
	{
		String str="abhishek";
		Map<Character,Integer> map=new HashMap<>();
		int n=str.length();
		for(int i=0;i<n;i++)
		{
			char ch=str.charAt(i);
			if(map.containsKey(ch))
			{
				map.put(ch,map.get(ch)+1);
			}
			else
			{
				map.put(ch,1);
			}
		}
		//System.out.println(map);
        //if we have two character having same occurance
		//example shashank s=2 and a=2
		//so the answer of the most occured character will be a 
		//always scanned in alpabetical order in an lexicographical form
		for(Map.Entry<Character,Integer> e:map.entrySet())
		{
			if(e.getValue()>1)
			{
				System.out.println(e.getKey());
				System.out.println(e.getValue());
				break;
			}
		}
	}
	
}
