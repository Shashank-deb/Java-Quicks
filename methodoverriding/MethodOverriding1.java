class P{
	public void property(){
		System.out.println("Cash+Gold+Land");
	}
	public void marry(){
		System.out.println("Deepika");
	}
}
class C extends P{
	@Override
	public void property(){
		System.out.println("This is Child of C");
	}
	@Override
	public void marry(){
		System.out.println("katrina");
	}
}
public class MethodOverriding1{
	public static void main(String [] args){
		   //P p=new P();
		  // P.marry();
           C c=new C();
           c.marry();;
           P p1=new C();
           p1.marry();
	}
}