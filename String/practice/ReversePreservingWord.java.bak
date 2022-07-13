public class ReversePreservingWord 
{
	public static void main(String[] args) 
	{
		String s="I LIVE IN INDIA";
		f(s);
	}
	static void f(String s){
		int n=s.length()-1;
		int start=0;
		int end=n;
		char [] ch=s.toCharArray();
		while(start<=end){
			//if the start character will contains the space so simply start++ and continue it
			if(ch[start]==' '){
				start++;
				continue;
			}
			//if the end character will contains the space so simply end-- and continue it
			else if(ch[end]==' '){
				end--;
				continue;
			}
			//if their is no spaces present in start and end simply swap first and then start++ and end--
			else{
				char temp=ch[start];
				ch[start]=ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(ch));
	}
}
