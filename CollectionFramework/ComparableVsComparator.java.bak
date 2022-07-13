import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;
public class ComparableVsComparator 
{
	public static void main(String[] args) 
	{
		List<Laptop> lap=new ArrayList<>();
		lap.add(new Laptop("Dell",16,800));
		lap.add(new Laptop("Apple",17,900));
		lap.add(new Laptop("Hp",12,1000));
		//System.out.println(lap); 
		//only those think which are comparable
		//Comparable interface are used to sort the 
	    //compareTo() method using some condition
		//Collections.sort(lap);
		//for(Laptop l:lap)
		//{
		//	System.out.println(l);
		//}



        //when we have a class which is not 
		//implementing an interface(Comparable)
		//when we want to change the sorting
		//Comparator.reverseOrder()
		//used for descending order sorting
		Comparator<Laptop> con=new Comparator<Laptop>(){
			public int compare(Laptop l1,Laptop l2)
			{
				if(l1.getPrice()>l2.getPrice())
					return 1;
				else
					return -1;
			}
		};
		Collections.sort(lap,con);
		for(Laptop l:lap)
		{
			System.out.println(l);
		}
	}
}
