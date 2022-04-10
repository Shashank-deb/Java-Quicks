abstract class My{
	public abstract void show();
}
class Outer{
	public void display(){
		My m=new My(){
			@Override
			public void show(){
				System.out.println("This is show method redefining in the Outer Class");
			}
		};
		m.show();
	}
}
public class AnonymousInnerDemo{
	public static void main(String [] args){
          Outer o=new Outer();
          o.display();
	}
}