import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class DeleteFromIterator 
{
	public static void main(String[] args) 
	{
		List<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("guava");
		list.add("orange");
		System.out.println("Before deleting the element: ");
		for(String element:list)
			System.out.println(element);
		Iterator<String> it=list.iterator();
		String str="";
		while(it.hasNext())
		{
			str=(String)it.next();
			if(str.equals("banana"))
			{
				it.remove();
				break;
			}
			
		}
		System.out.println("After deleting the element");
		for(String element:list)
			System.out.println(element);
	}
}
