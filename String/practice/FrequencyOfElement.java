public class FrequencyOfElement 
{
	public static void main(String[] args) 
	{
		String s="shashank";
	    f(s);
	}
	static void f(String s){
		char [] ch=s.toCharArray();
		int n=s.length();
		int [] freq=new int[n];
		for(int i=0;i<n;i++){
			freq[i]=1;
			for(int j=i+1;j<n;j++){
				if(ch[i]==ch[j]){
				 //if the adjacent element are equal than increase the frequency
					freq[i]++;
				    
				//Set string[j] to 0 to avoid printing visited character  
				  ch[j]='0';
				}
			}
		}

		//now printing the element according to frequency wise of the particular element
		for(int i=0;i<freq.length;i++){
			if(ch[i] != ' ' &&  ch[i] != '0')
				System.out.println(ch[i]+"="+freq[i]);
		}
	}
}
