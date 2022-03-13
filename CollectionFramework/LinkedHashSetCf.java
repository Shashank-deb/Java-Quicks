import java.util.LinkedHashSet;
import java.util.Set;
class LinkedHashSetCf 
{
	public static void main(String[] args) 
	{
		//when ever their is some Linked is their
		//the order of insertion is  contiguous
        //internal using hashing methods
		//unique element
		//insertion is ordered and maintain the
		//flow
		Set<Integer> set=new LinkedHashSet<>();
		set.add(10);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(50);
		System.out.println(set);
		set.remove(50);
		System.out.println(set);
		System.out.println(set.contains(10));
		System.out.println(set.isEmpty());
		set.clear();
		System.out.println(set);

	}
}
