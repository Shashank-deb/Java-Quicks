import java.util.List;
import java.util.ArrayList;
public class FindAllAnagrams 
{
	public static void main(String[] args) 
	{
	    String s="cbaebabacd";
		String p="abc";
		System.out.println(findAnagrams2(s,p));
	}
	//Time Complexity-O(n) and Space Complexity-O(n)
	static List<Integer> findAnagrams1(String s,String p){
		List<Integer> ans=new ArrayList<>();
		if(s.length()==0 || s==null)return ans;
		int [] anagram_counts=new int[26];
		for(char ch:p.toCharArray()){
			anagram_counts[ch-'a']++;
		}

			int start=0;
			int end=0;
			int count=p.length();
			while(end<s.length()){
				if(anagram_counts[s.charAt(end++)-'a']-- >=1)
					count--;

				if(count==0)
					ans.add(start);

				if(end-start==p.length() && anagram_counts[s.charAt(start++)-'a']++ >=0)
					count++;
			}

		
		return ans;

	}


  //Time Complexity-O(n) and Space Complexity-O(n)
	static List<Integer> findAnagrams2(String original,String pattern){
		List<Integer> result=new ArrayList<>();
		int [] pattern_count=new int[26];
		for(int i=0;i<pattern.length();i++){
			pattern_count[pattern.charAt(i)-'a']++;
		}

		int start=0;
		int end=0;
		int count=pattern.length();
		while(end<original.length()){
			if(pattern_count[original.charAt(end)-'a']>=1){
				count--;
			 }
			 pattern_count[original.charAt(end)-'a']--;
			 end++;

			 if(count==0){
				result.add(start);
			 }

			 if(end-start==pattern.length()){
				if(pattern_count[original.charAt(start)-'a']>=0){
					count++;
				}
				pattern_count[original.charAt(start)-'a']++;
				start++;
			 }
		}
		return result;
	}
}
