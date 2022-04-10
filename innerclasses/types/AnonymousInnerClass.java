abstract class My{
	abstract void display();
}
class Outer{
	public void meth(){
		My m=new My(){
			public void display(){
				System.out.println("Hello");
			} 
		};
		m.display();
	}
}
public class AnonymousInnerClass{
	public static void main(String [] args){
          Outer o=new Outer();
          o.meth();
	}
}