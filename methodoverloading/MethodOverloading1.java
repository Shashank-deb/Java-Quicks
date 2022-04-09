class Test{
	public void m1(){
		System.out.println("No argument");
	}
	public void m1(int i){
		System.out.println("Integer argument");
	}
	public void m1(double d){
		System.out.println("Double argument");
	}
}
public class MethodOverloading1{
	public static void main(String [] args){
          Test t=new Test();
          t.m1();
          t.m1(10);
          t.m1(10.5);
	}
}