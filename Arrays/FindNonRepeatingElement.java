import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class FindNonRepeatingElement 
{
	public static void main(String[] args) 
	{
		int [] arr={1,2,-1,1,3,1};
		f3(arr);
	}
	static void f1(int [] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			boolean repeated=false;
			for(int j=0;j<n;j++){
				if(i!=j && arr[i]==arr[j]){
					repeated=true;
				    break;
				   }
			}
			if(!repeated){
				System.out.print(arr[i]+",");
			}
		}
	}

	static void f2(int [] arr){
		int n=arr.length;
		Arrays.sort(arr);
		if(arr[0]!=arr[1])System.out.print(arr[0]);
		System.out.println("");
		for(int i=1;i<n-1;i++){
			if(arr[i-1]!=arr[i] && arr[i]!=arr[i+1])
				System.out.print(arr[i]+",");
		}
		if(arr[arr.length-2] != arr[arr.length-1]) System.out.print(arr[arr.length-1]);
	}

	static void f3(int [] arr){
		int n=arr.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			if(map.containsKey(arr[i])){
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
		}

		for(Map.Entry<Integer,Integer> entrySet:map.entrySet()){
			if(entrySet.getValue()==1){
				System.out.println(entrySet.getKey());
			}
		}
	}
}
