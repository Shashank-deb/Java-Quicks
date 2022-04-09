//Every java class will act as Single Unit and at this Single Unit their as many no 
//of data inside in the form of data members
class Student{
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	private String name;
	private int age;

	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age=age;
	}
}
public class Encapsulation{
	public static void main(String [] args){
            Student s=new Student("Shashank",21);
            System.out.println(s.getName());
            System.out.println(s.getAge());
	}
}