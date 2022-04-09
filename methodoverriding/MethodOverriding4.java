// the scope of the data type are as follows
//private<default<protected<public
//in this example the scope of the parent class is public it is reduced to protected in child
//class
class P{
	public void m1(){

	}
}
class C extends P{
	protected void m1(){

	}
}
public class MethodOverriding4{
	public static void main(String [] args){
             P p=new C();
             p.m1();
	}
}