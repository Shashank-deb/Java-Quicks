//Any service required specification is know as interface.,
//Interface does not required any partial implementation .
//Any contract between client and service provider is know as interface.
//100% pure abstract class is know as interface.
interface Intera{
	public void m1();
	public void m2();
}
class ServiceProvider implements Intera{
	@Override
	public void m1(){
		System.out.println("This is redefining method of m1");
	}
	@Override
	public void m2(){
		System.out.println("This is redefining method of m2");
	}
}
public class InterfaceExample{
public static void main(String [] args){
	ServiceProvider s=new ServiceProvider();
	s.m1();
	s.m2();

}
}