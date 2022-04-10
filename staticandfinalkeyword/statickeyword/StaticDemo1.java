class HondaCity{
	static double price=10_000_000;
	int a,b;
	static double onRoadPrice(String city){
		switch(city){
		case "delhi":
			return price+price*0.1;
		case "mumbai":
			return price+price*0.09;
		}
        return price;
	}

}
public class StaticDemo1{
	public static void main(String [] args){
            HondaCity h1=new HondaCity();
            HondaCity h2=new HondaCity();
            System.out.println(HondaCity.onRoadPrice("delhi"));
            System.out.println(HondaCity.price);
	}
}