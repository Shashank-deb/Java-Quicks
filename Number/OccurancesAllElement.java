import java.util.Map;
import java.util.HashMap;
public class OccurancesAllElement 
{
	public static void main(String[] args) 
	{
      String str="shashank";
	  f(str);
	}
	static void f(String s){
		Map<Character,Integer> map=new HashMap<>();
		int n=s.length();
		for(int i=0;i<n;i++){
        			char ch=s.charAt(i);
					if(map.containsKey(ch)){
						map.put(ch,map.get(ch)+1);
					}
					else{
						map.put(ch,1);
					}
		}
		System.out.println(map);
		
	}
}
