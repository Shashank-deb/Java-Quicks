class Test{
	public void m1(int i){
		System.out.println("General method");
	}
	public void m1(int ... i){
		System.out.println("Var-args method");
	}
}
public class MethodOverloading5{
	public static void main(String [] args){
               Test t=new Test();
               t.m1();
               t.m1(10,20);
               t.m1(30);
	}
}