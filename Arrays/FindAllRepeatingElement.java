import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
public class FindAllRepeatingElement 
{
	public static void main(String[] args) 
	{
		int [] arr={5,5,5,3,2,1};
		f3(arr);
	}


	static void f1(int [] arr){
		int count=0;
		int n=arr.length;
		int [] freq=new int[arr.length];
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
			    if(arr[i]==arr[j])
					freq[count++]=arr[i];
			}
		}

		for(int i=0;i<count;i++){
			if(freq[i]!=freq[i+1])
				System.out.println(freq[i]);
		}
	}


	static void f2(int [] arr){
		int n=arr.length;
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++)
			if(arr[i]==arr[i+1])
			System.out.println(arr[i]);
		
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
			if(entrySet.getValue()>1){
				System.out.println(entrySet.getKey());
				break;
			}
		}
	}
}
