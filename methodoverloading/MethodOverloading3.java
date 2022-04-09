class Test{
	public void m1(Object o){
		System.out.println("Object version");
	}
	public void m1(String v){
		System.out.println("String version");
	}
}
public class MethodOverloading3{
	public static void main(String [] args){
           Test t=new Test();
           t.m1(new Object());
           t.m1("durga");
           t.m1(null);
	}
}