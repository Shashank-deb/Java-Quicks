import java.util.*;
import java.util.Map;
public class StringQuestion 
{
	public static void main(String[] args) 
	{
// 		String str="Shashank";
// 		char ch[]=str.toCharArray();
// 		for(int i=ch.length-1;i>=1;i--)
// 		{
// 		    System.out.print(ch[i]);
// 		}


    //   for(int i=str.length()-1;i>=0;i--)
    //   {
    //       System.out.println(str.charAt(i));
    //   }
    
    
    
    // StringBuffer sb=new StringBuffer(str);
    // System.out.println(sb.reverse());
    
    
    // StringBuilder sbuilder=new StringBuilder(str);
    // System.out.println(sbuilder.reverse());
    
    
    // String str="@##$$@#$jav!!a";
    // String plainStr=str.replaceAll("[^a-zA-Z0-9]","");
    // System.out.println(plainStr);
    
    
    
    // String str="ja va st a r";
    // String space=str.trim().replaceAll("\\s","");
    // System.out.println(space);
    
    
    
    
    
    
    // String str="programming";
    // StringBuilder sb1=new StringBuilder();
    // str.chars().distinct().forEach(c->sb1.append((char)c));
    // System.out.println(sb1);
    
    
    
    
    
    
    // String str="programming";
    // StringBuilder sb2=new StringBuilder();
    // for(int i=0;i<str.length();i++)
    // {
    //     char ch=str.charAt(i);
    //     int ind=str.indexOf(ch,i+1);
    //     if(ind==-1)
    //     {
    //         sb2.append(ch);
    //     }
    
    // }
    // System.out.println(sb2);
    
    
    
    
    
    // String str="programming";
    // char [] ch=str.toCharArray();
    // StringBuilder sb=new StringBuilder();
    // for(int i=0;i<str.length();i++)
    // {
    //     boolean repeated=false;
    //     for(int j=i+1;j<str.length();j++)
    //     {
    //         if(ch[i]==ch[j])
    //         {
    //             repeated=true;
    //             break;
    //         }
    //     }
    //     if(!repeated){
    //         sb.append(ch[i]);
    //     }
    //     System.out.println(sb);
    
    
    
    
    
    // String str="programming";
    // StringBuilder sb=new StringBuilder();
    // Set<Character> set=new LinkedHashedSet<>();
    // for(int i=0;i<str.length();i++)
    // {
    //     set.add(str.charAt(i));
    // }
    
    // for(Character c:set)
    // {
    //     sb.append(c);
    // }
    // System.out.prinln(sb);

    
    
    
    
    
    //   Sort the string in alphabetical 
    //  String str="rock";
    //  char[] ch=str.toCharArray();
    //  char temp;
    //  for(int i=0;i<ch .length;i++)
    //  {
    //      for(int j=i+1;j<ch.length;j++)
    //      {
    //          if(ch[i]>ch[j])
    //          {
    //             temp=ch[i];
    //             ch[i]=ch[j];
    //             ch[j]=temp;
    //          }
    //      }
    //  }
    //  System.out.println(new String(ch));
    
    
    
    
    
    //sort method 
    // String str="rock";
    // char [] arr=str.toCharArray();
    // Arrays.sort(arr);
    // System.out.println(arr);
    
    
    
    //replace word with it occurance
    
    String str="opentext";
	char charToReplace='t';


	if(str.indexOf(charToReplace)==-1)
		{
			System.out.println("Character is not presented in String");
			System.exit(0);
		}

     char [] arr=str.toCharArray();
	 int cnt=1;
	 for(int  i=1;i<arr.length;i++)
		{
			if(arr[i]==charToReplace){
				arr[i]=String.valueOf(cnt).charAt(0);
				cnt++;
			}
		}
		System.out.println(arr);

    
        //Using HashMap
		String input="hello";
		Map<Character,Integer> map=new HashMap<>();
        char [] ar=input.toCharArray();
		for(char ch:ar)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}
			else
			{
				int count=map.get(ch);
				map.put(ch,count+1);
			}
		}
		System.out.println(map);
    
	}
}
