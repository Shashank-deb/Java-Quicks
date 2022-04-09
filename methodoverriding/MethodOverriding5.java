//Method Overriding in the variable is takes care by compiler based on reference type
class P{
String s="Parent";
}
class C extends P{
String s="Child";
}
public class MethodOverriding5{
	public static void main(String [] args){
        P p=new P();
        System.out.println(p.s);
        C c=new C();
        System.out.println(c.s);
        P p1=new P();
        System.out.println(p1.s);
	}
}