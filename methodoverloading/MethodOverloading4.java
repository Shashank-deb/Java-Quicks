class Test{
	public void m1(String s){
		System.out.println("String version");
	}
	public void m1(StringBuffer sb){
		System.out.println("StringBuffer version");
	}
}
public class MethodOverloading4{
	public static void main(String [] args){
          Test t=new Test();
          t.m1("durga");
          t.m1(new StringBuffer("durga"));
          t.m1(null);
	}
}