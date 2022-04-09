abstract class Vechicle{
	public abstract int getNoOfWheels();
}
class Bus extends Vechicle{
	@Override
	public int getNoOfWheels(){
		return 6;
	}
}
class Auto extends Vechicle{
	@Override
	public int getNoOfWheels(){
		return 3;
	}
}
public  class AbstractClass2{
	public static void main(String [] args){
        Bus b=new Bus();
        System.out.println(b.getNoOfWheels());
        Auto a=new Auto();
        System.out.println(a.getNoOfWheels());
	}
}