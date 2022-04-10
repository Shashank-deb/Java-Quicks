abstract class My{
	public abstract void show();
}
class Outer{
	public void display(){
		  new My(){
		  	@Override
			public void show(){
				System.out.println("This is show method");
			}
		}.show();

	}
}
public class AnonymousInnerDemo2{
	public static void main(String [] args){
        Outer o=new Outer();
        o.display();
	}
}