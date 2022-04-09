class Test{
	public void m1(int i){
		System.out.println("int-arg method");
	}
	public void m1(float f){
		System.out.println("float-arg method");
	}
}
public class MethodOverloading2{
	public static void main(String [] args){
            Test t=new Test();
            t.m1(10);
            t.m1(10.4f);
            t.m1('a');
	}
}