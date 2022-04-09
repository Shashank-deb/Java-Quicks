class P{
	private void m1(){
      System.out.println("m1 of parent");
	}
}
class C extends P{
	private void m1(){
       System.out.println("m1 of child");
	}
}
public class MethodOverriding2{
	public static void main(String [] args){
          P p=new C();
          p.m1();
	}
}