class Outer{
	static int x=10;
	static int y=20;
	static class Inner{
		public void show(){
			System.out.println(x);
			System.out.println(y);
		}
	}
}
public class StaticInnerDemo{
	public static void main(String [] args){
            Outer.Inner i=new Outer.Inner();
            i.show();
	}
}