// package privatemodifier.pack1;
// public class A{
// 	protected void m1(){
// 		System.out.println("A is protected method");
// 	}
// }
// class B extends A{
// 	public static void main(String [] args){
// 		A a=new A();
// 		a.m1();
// 		B b=new B();
// 		b.m1();
// 		A a1=new B();
// 		a1.m1();
// 	}
// }

package privatemodifier.pack1;
 class A{
	protected void m1(){
		System.out.println("A protected method");
	}
}