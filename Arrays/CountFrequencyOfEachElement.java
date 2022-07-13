import java.util.Map;
import java.util.HashMap;
public class CountFrequencyOfEachElement 
{
	public static void main(String[] args) 
	{
		int [] arr={10,5,10,15,10,5};
		f2(arr);
	}
	static void f1(int [] arr){
		int n=arr.length;
		boolean [] visited=new boolean[n];
		
		for(int i=0;i<n;i++){
			if(visited[i]==true)
				continue;
			int count=1;
			for(int j=i+1;j<n;j++){
				if(arr[i]==arr[j]){
					visited[j]=true;
					count++;
				}
			}

			System.out.println(arr[i]+"=="+count);
		} 		
	}

	static void f2(int [] arr){
		int n=arr.length;
		Map<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			if (map.containsKey(arr[i]))
			{
				map.put(arr[i],map.get(arr[i])+1);
			}
			else{
				map.put(arr[i],1);
			}
	   	}

		for(Map.Entry<Integer,Integer> entrySet:map.entrySet()){
			System.out.println(entrySet.getKey()+"=="+entrySet.getValue());
		}
	}
}
