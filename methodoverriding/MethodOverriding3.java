// final to non final cannot override and anything in java is override
class P{
	public final  void m1(){
      System.out.println("final m1");
	}
}
class C extends P{
	public void m1(){
     System.out.println("Normal m1");
	}
}
public class MethodOverriding3{
	public static void main(String [] args){
         P p=new C();
         p.m1();
	}
}