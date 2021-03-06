//Hiding the internal implementation only provided the set of services that a particular service provider
//is offering is know as abstraction
//It is also know as 100% data hiding
//abstract class make the construction of the abstraction concept possible
abstract class Bank{    
    abstract int getInterestRate();    
}    
//concrete class
class Citi extends Bank{ 
    @Override   
    int getInterestRate()
		{
		return 7;
		}    
}
//concrete class
class HSBC extends Bank{    
    @Override
    int getInterestRate()
		{
		  return 6;
	     }    
}    
     
class Main{    
    public static void main(String args[]){    
        Bank b;  
        b = new Citi ();      // concrete class object
        System.out.println("Citi Rate of Interest is: "+b.getInterestRate()+"%");    
        b = new HSBC ();        // concrete class object
        System.out.println("HSBC Rate of Interest is: "+b.getInterestRate()+"%");    
    }
}  