//This is the root class Animal having the concrete method eat
class Animal
{  
void eat(){System.out.println("eating...");}  
}  

//This is the sub class Dog having the override method eat 
//Dog eating bread
class Dog extends Animal
{  
void eat(){System.out.println("eating bread...");}  
}  

//This is the sub class Cat having the override method eat
//Cat eating rat
class Cat extends Animal
{  
void eat(){System.out.println("eating rat...");}  
}  

//This is the sub class Lion having the override method eat
//Lion eating meat 
class Lion extends Animal
{  
void eat(){System.out.println("eating meat...");}  
}  
//This is the main class
public class PolyDemo{
//This is the main method
	public static void main(String [] args){
         Animal a;  
		a=new Dog();  
		a.eat();  
		a=new Cat();  
		a.eat();  
		a=new Lion();  
		a.eat();  
}  
}