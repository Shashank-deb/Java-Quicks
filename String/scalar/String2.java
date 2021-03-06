public class String2 
{
	//This questions is given word 
	//There is no space between front and last
	//reverse the word by word last 
	//str="love hate data airtel"
	//1.first  reversing the given string the output will be
	//str="letria atad etah evol"
	//2.than reversing each word to get the output
	//take two pointer approach 
	//p1 p2
	//0   6  reverse(str,0,5)
	//3.now the new p1=p2+1 and p2=7 iterating character by character untill getting 
	//a space 
	//7   11  reverse(str,7,10)
	//4.now the new p1=p2+1=12 and p2=12 iterating character by character untill getting
	//a space
	//12  16  reverse(str,12,15)
	//5.now the new p1=p2+1=17 and p2=17 iterating character by character untill getting 
	//a space 
	//17  21  reverse(str,17,20)
	//6.now the new p1=p2+1=22 so it is end of the word so we need to stop 
	//there is no more character in the given string 
	//7.p1(22 is length of p1)>length of the string(21 is the original character)
	//str="airtel data hate love"

	

	//str="marry ex friend"
	//after reversing the given string the output will be
	//str="friend ex marry"
	public static void main(String[] args) 
	{
		String str="marry ex friend";
		reverseWord(str);
	}
	static void reverseWord(String str){	
        int n=str.length();
		//first of all reverse the entire string
		reverse(str,0,n-1);
		int p1=0;
		int p2=0;
		while(p1<n){
		//iterating the p2 untill you will not get the space or end
		while(p2<n && str.charAt(p2)==' ' ){
			p2++;
		}
		reverse(str,p1,p2-1);
		//both are pointing to start of every word
		p1=p2+1;
		p2=p1;
		}
		
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
