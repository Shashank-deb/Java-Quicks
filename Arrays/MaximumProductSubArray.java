public class MaximumProductSubArray 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,-3,0,-4,-5};
		System.out.println("Maximum Product: "+f(arr));
	}
	static int f(int [] arr){
		int maxi=Integer.MIN_VALUE;
		int n=arr.length;
		for(int i=0;i<n;i++){
			int product=1;
			for(int j=i+1;j<n;j++){
				product=product*arr[j];
				maxi=Math.max(product,maxi);
			}
		}
		return maxi;
	}
}
