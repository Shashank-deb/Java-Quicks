class My{
	static int s;
	static{
		System.out.println("Block1");
		s=10;
	}
	static{
		System.out.println("Block2");
	}
}
public class StaticBlock1{
	public static void main(String [] args){
		My m=new My();
       System.out.println("Main Method");
	}
}