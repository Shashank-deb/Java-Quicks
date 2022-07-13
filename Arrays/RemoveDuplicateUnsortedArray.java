import java.util.HashMap;
public class RemoveDuplicateUnsortedArray 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,1,1,3};
		f2(arr);
	}

	//TC-0(n^2)+0(n)
	//SC-0(2n)
	static void f1(int [] nums){
		int n=nums.length;
		int [] visited=new int[n];
		for(int i=0;i<n;i++){
			visited[i]=1;
		}

		for(int i=0;i<n;i++){
			if(visited[i]==1){
			for(int j=i+1;j<n;j++){
				if(nums[i]==nums[j]){
					visited[j]=0;
				}
			}
		  }
		}
		for(int i=0;i<n;i++){
			if(visited[i]==1){
				System.out.println(nums[i]);
			}
		}
	}



	//TC-0(n)
	//SC-0(n)
	static void f2(int [] arr){
		int n=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
		     if(!map.containsKey(arr[i])){
				System.out.println(arr[i]);
				map.put(arr[i],1);
		     }	
		}
		

	}
}
