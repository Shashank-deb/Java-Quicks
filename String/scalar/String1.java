public class String1 
{
    //This questions is related to reverse the 
	//part of the string 
	//str=abacdaba
	//reverse[2,6]
	//after swapping the character between 2 and 6
	//str=abbadcaa
	//two pointer
	//p1 p2
	//2<->6
	//3<->5
	//4<->4
	//when both the pointer is equal this is condition to stop 


	//str=xayacdefga
	//reverse[3,8]
	//after swapping the character between 3 and 8
	//str=xaygfedcaa
	//p1 p2
	//3<->8
	//4<->7
	//5<->6
	//6<->5
	//when start pointer is greater than end pointer this is condition 
	//to stop
	 


	//also we have to do with 2 pointer approach
	public static void main(String[] args) 
	{
		String str="nayan";
		int s=2;
		int e=3;
		System.out.println("Reversing of String at given range is: ");
		System.out.println(reverse(str,s,e));
	}
	static String reverse(String str,int s,int e){
		int p1=s;
		int p2=e;
		char [] ch=str.toCharArray();
		while(p1<p2){
			char temp=ch[p1];
			ch[p1]=ch[p2];
			ch[p2]=temp;
			p1++;
			p2--;
		}
		return new String(ch);
	}
	

}
