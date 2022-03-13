import java.util.HashSet;
import java.util.Set;
public class HashSetCf 
{
	public static void main(String[] args) 
	{
		//tc-o(1)
		//when ever their is some Hash is their
		//the order of insertion is not contiguous
        //internal using hashing methods
		//unique element
		//Set<Integer> set=new HashSet<>();
		//set.add(10);
		//set.add(30);
		//set.add(40);
		//set.add(50);
		//set.add(50);
		//System.out.println(set);
		//set.remove(50);
		//System.out.println(set);
		//System.out.println(set.contains(10));
		//System.out.println(set.isEmpty());
		//set.clear();
		//System.out.println(set);


		Set<Student> studentSet=new HashSet<>();
		studentSet.add(new Student("Shashank",1001));
		studentSet.add(new Student("Shivam",1002));
		studentSet.add(new Student("Somu",1003));
		studentSet.add(new Student("Shivani",1004));
		studentSet.add(new Student("Sadique",1005));
		System.out.println(studentSet);


	}
}
