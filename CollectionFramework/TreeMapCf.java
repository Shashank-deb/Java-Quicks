import java.util.TreeMap;
import java.util.Map;
public class TreeMapCf 
{
	public static void main(String[] args) 
	{
	
		Map<String,Integer> numbers=new TreeMap<>();
		//alphabetical sorted in order
		 numbers.put("One",1);
		 numbers.put("Two",1);
		 numbers.put("Three",1);
		 numbers.put("Four",1);
		 numbers.put("Five",1);
		 numbers.remove("Three");
		 System.out.println(numbers);
		 //if(!numbers.containsKey("Two"))
		//{
		//	numbers.put("Two",23);
		//}
		//numbers.putIfAbsent("Two",23);


		//iterating the map using Entry of entrySet
		 
		 System.out.println(numbers);

		 for(Map.Entry<String,Integer> e:numbers.entrySet())
		{
		System.out.println(e);
		System.out.println(e.getKey());
		System.out.println(e.getValue());
		}

		for(String key:numbers.keySet())
		{
			System.out.println(key);
		}
		for(Integer value:numbers.values())
		{
			System.out.println(value);
		}
		System.out.println(numbers.containsValue(3));
		System.out.println(numbers.isEmpty());
	}
}
