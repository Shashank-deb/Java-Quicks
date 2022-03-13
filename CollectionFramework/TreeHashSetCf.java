import java.util.TreeSet;
import java.util.Set;
class TreeHashSetCf 
{
	public static void main(String[] args) 
	{
		//elemented in the sorted form
		//and set is also mainted
		//tc-o(logn)
		Set<Integer> set=new TreeSet<>();
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
