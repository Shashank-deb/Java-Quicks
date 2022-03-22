import java.util.Set;
import java.util.LinkedHashSet;
public class String4 
{
	public static void main(String[] args) 
	{
		//Removing the duplicates
		 String str="programming";
		//StringBuilder sb1=new StringBuilder();
        //str.chars().distinct().forEach(c->sb1.append((char)c));
        //System.out.println(sb1);



		//Removing the duplicates
	//	StringBuilder sb2=new StringBuilder();
	//	for(int i=0;i<str.length();i++)
      // 			char ch=str.charAt(i);
		//        int idx=str.indexOf(c,i+1);
		//		if(idx==-1)
		// {
		//	sb2.append(ch);
		 // }

	//}
	//System.out.println(sb2);





	//StringBuilder sb3=new StringBuilder();
   // char ch[]=str.toCharArray();
	//for(int i=0;i<str.length();i++)
	//{
	//	boolean repeated=false;
	//	for(int j=i+1;j<str.length();j++)
	//	{
	//		if(ch[i]==ch[j])
	//		{
	//			repeated=true;
	//			break;
	//		}
	//	}
	//	if(!repeated)
	//	{
	//		sb3.append(ch[i]);
	//	}
		
	//}
	//System.out.println(sb3);




//approach 4
   StringBuilder sb=new StringBuilder();
   Set<Character> set=new LinkedHashSet<>();
   for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
			{
				sb.append(c);
			}
			System.out.println(sb);

}
}
