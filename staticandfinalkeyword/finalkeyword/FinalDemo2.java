class Super{
	final void m1(){
		System.out.println("Hello");
	}
}
class Sub extends Super{
	void m1(){
		System.out.println("Hello");
	}
	void m2(){
		System.out.println("Bye");
	}
}
public class FinalDemo2{
	public static void main(String [] args){
            Sub s=new Sub();
            s.m1();
	}
}