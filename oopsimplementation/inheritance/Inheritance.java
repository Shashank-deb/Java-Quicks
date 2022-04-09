class P{
	public void m1(){
		System.out.println("Parent");
	}
	public void m2(){
		System.out.println("Parent m2");
	}
}
class C extends P{
	public void m2(){
		System.out.println("Child");
	}
}
public class Inheritance{
	public static void main(String [] args){
          P p=new P();
          p.m1();
          //p.m2();

          C c=new C();
          c.m1();
          c.m2();


          P p1=new C();
          p1.m1();
          p1.m2();
	}
}