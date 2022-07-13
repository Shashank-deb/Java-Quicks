//single inheritance
class A
{
}
class B extends	A
{
}








//multiple inheritance(not supported in java)
//this is nothing but diamond access problem occur in java
//if we have the meth1() in both class A and B so 
//their is ambiguity problem which is occur in java
//class C will not determine which m1() method is called
class A
{
	meth1(){}
}
class B
{ 
	meth1(){}
}
class C extends A,B
{
}




//The alternative of inheritance is interface
interface A
{
	
}
interface B
{
	
}
class C implements A,B{
	
}
//we can also inherited the interface(is-a relationship)
interface C extends B
{
}









//multilevel inheritance
class A

{
}
class B extends A
{
}
class C extends B
{
}



//hierachical inheritance
class A
{
}
class B extends A
{
}
class C extends A
{
}
class D extends A
{
}







//hybrid inheritance
 class A
{
    // Methods and Fields of class A
}
 interface B
{
  // Methods and Fields of InterfaceB
}
 interface C 
{
  // Methods and Fields of InterfaceC
}
 class D extends A implements B,C
{
    // Implementation of the method defined in Interfaces, InterfaceB and InterfaceC

    // Methods of class D
   
}







public class Inheritance 
{
	public static void main(String[] args) 
	{
		
	}
}
