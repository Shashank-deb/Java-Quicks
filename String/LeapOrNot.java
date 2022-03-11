public class LeapOrNot 
{
	public static void main(String[] args) 
	{
		int year=2016;
		if((year%4==0) && (year%100!=0))
			System.out.println("Leap Year");
		else
			System.out.println("Not Leap Year");
	}
}
