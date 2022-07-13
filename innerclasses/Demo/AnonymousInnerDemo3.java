interface My{
	public void show();
}
class Outer{
	public void display(){
		My m=new My(){
			@Override
			public void show(){
				System.out.println("Hello this is anonymous class !");
			}
		};
		m.show();
	}
}
public class AnonymousInnerDemo3{
	public static void main(String [] args){
              Outer o=new Outer();
              o.display();
	}
}