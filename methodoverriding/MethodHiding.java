//this is method hiding compile time polymorphism 
//the method resolution is takes care by compiler based on reference type 
class P{
	public static void m1(){
      System.out.println("Parent");
	}
}
class C extends P{
	public static void m1(){
      System.out.println("Child");
	}
}
public class MethodHiding{
	public static void main(String [] args){
            P p=new P();
            p.m1();
            C c=new C();
            c.m1();
            P p1=new P();
            p1.m1();
	}
}