//Every java class will act as Single Unit and at this Single Unit their as many number 
//of data inside in the form of data members
//This is nothing but encapsulation=abstraction+data hiding know as Encapsulation
class Student{
	private String name;
	private int age;
	//Generating the Constructor of Student Class
	public Student(String name,int age){
		this.name=name;
		this.age=age;
	}
	//Generating the Getter and Setter of Student Class
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