//static inner classes are used for static data members only and this type of members
//are only related to class level access
class Outer{
	static int x=10;
	static int y=20;
	static class Inner{
		void display(){
           System.out.println(x);
           System.out.println(y);
		}
	}
}
public class StaticInnerClass{
	public static void main(String [] args){
           Outer.Inner i=new Outer. Inner();
           i.display();
	}
}