public class AverageOfArray 
{
	public static void main(String[] args) 
	{
	   int [] arr={5,5};
	   System.out.println(f(arr));
	}
	static double  f(int [] arr){
		int n=arr.length;
		double sum=0;
		for(int i=0;i<n;i++){
			sum+=(double)arr[i];
		}
		double average=sum/n;
		return average;
	}
}
