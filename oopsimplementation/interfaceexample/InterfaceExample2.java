//This example is related to bank interface
interface Bank{  
float rateOfInterest();  
}  
class SBI implements Bank
{  
public float rateOfInterest(){
	return 9.15f;
	}  
}  
class PNB implements Bank{  
public float rateOfInterest()
	{
	return 9.7f;
	}  
}  
public class InterfaceExample2{  
public static void main(String[] args){  
//Reference of the interface is possible but object creation is not possible
Bank sbi=new SBI();  
Bank pnb=new PNB();
System.out.println("ROI for SBI: "+sbi.rateOfInterest());  
System.out.println("ROI for PNB:"+pnb.rateOfInterest());
}
}  