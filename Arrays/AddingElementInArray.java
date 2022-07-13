public class AddingElementInArray 
{
	//adding element at the begining
	//adding element at the end
	//adding element at the certain position
	public static void main(String[] args) 
	{
		int value=10;
		int [] arr={3,4,5,6,7};
		int n=arr.length-1;
		for(int i=0;i<=n;i++){
			System.out.print(arr[i]+",");
		}
      System.out.println("");
	    int position=4;
		insertBetween(arr,n,value,position);
		for(int i=0;i<=n;i++){
			System.out.print(arr[i]+",");
		}
	}
	//adding element at the begining
	static void insertFirst(int [] arr,int n,int  value){
		for(int i=n-1;i>=0;i--){
			arr[i+1]=arr[i];
		}
		arr[0]=value;
	}
	static void insertLast(int [] arr,int n,int value){
		arr[n]=value;
	}
	static void insertBetween(int [] arr,int n,int value,int position){
		for(int i=n;i>=position;i--){
			arr[i]=arr[i-1];
		}
		arr[position-1]=value;
	}

}
