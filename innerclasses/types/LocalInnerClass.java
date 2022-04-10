//This is a class present inside a particular method know as local class
class Outer{
	void display(){
		class Inner{
			void innerDisplay(){
			System.out.println("Hello");
		   }
		}
		Inner i=new Inner();
		i.innerDisplay();
	}
	
}
public class LocalInnerClass{
	public static void main(String [] args){
            Outer i=new Outer();
            i.display();
	}
}