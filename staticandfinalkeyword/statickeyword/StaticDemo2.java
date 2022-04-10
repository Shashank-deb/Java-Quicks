class Test{
	static int x=10;
	int y=20;
	void show(){
		System.out.println(x+" "+y);
	}
	static void display(){
		System.out.println(x);
	}
}
public class StaticDemo2{
	public static void main(String [] args){
        Test t=new Test();
        t.show();
        t.display();
	}
}