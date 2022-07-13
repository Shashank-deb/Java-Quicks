public class SumOfArray 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,3,4,5};
		System.out.println(f(arr));
	}
	static int f(int [] arr){
		int n=arr.length;
		int sum=0;
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		return sum;
	}
}
