//Data hiding in java is acheived by making the data members as private modifiers
//This is the Account class where their is the member balance 
//This is also know as Tightly encapsulated class
class Account{
	private double balance;
	public Account(double balance){
		this.balance=balance;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance=balance;
	}
}
public class DataHiding{
	public static void main(String [] args){
         Account a=new Account(10.3);
         System.out.println(a.getBalance());
	}
}