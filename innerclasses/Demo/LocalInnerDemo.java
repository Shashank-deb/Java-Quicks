class Outer{
	public void display(){
		class Inner{
			public void show(){
				System.out.println("Hello");
			}
		}
		Inner i=new Inner();
		i.show();
	}
}
public class LocalInnerDemo{
	public static void main(String [] args){
       Outer i=new Outer();
       i.display();
	}
}