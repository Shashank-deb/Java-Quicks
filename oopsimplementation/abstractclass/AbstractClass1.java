abstract class Test{
	public abstract void m1();
	public abstract void m2();
}
class SubTest extends Test{
      public void m1(){
         System.out.println("This is m1");
      }
      public void m2(){
         System.out.println("This is m2");
      }
}
public class AbstractClassDemo{
	public static void main(String [] args){
		 SubTest t=new SubTest();
		 t.m1();
		 t.m2();
	}
}