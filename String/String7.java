import java.util.HashMap;
import java.util.Map;
class String7 
{
	//first non repeating element in an String
	public static void main(String[] args) 
	{
		String str="AABCDBECF";
		for(int i=0;i<str.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<str.length();j++)
			{
				if(i!=j && str.charAt(i)==str.charAt(j))
				{
			    	unique=false;	
				}
			}
			if(unique)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}



		//USING THE MAP(KEY,VALUE)pair logic
		Map<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++){
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
		System.out.println(map);

		for(Entry<Character,Integer> entrySet:map.entrySet())
		{
			if(entrySet==1)
			{
				System.out.println(entrySet.getValue());
				break;
			}
		}

	}
}
