package privatemodifier.pack1;
class A{
	private void m1(){
		System.out.println("A class private method");
	}
}
class Test{
	public static void main(String [] args){
		A a=new A();
		a.m1();
	}
}