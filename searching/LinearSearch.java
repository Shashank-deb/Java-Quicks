public class LinearSearch 
{
	//tc-0(n)
	//sc-0(n)
	public static void main(String[] args) 
	{
		int [] arr={34,52,1,52};
		int target=1;
		System.out.println(search(arr,target));
	}
	static int search(int [] arr,int target)
	{
		    for(int i=0;i<arr.length;i++){    
            if(arr[i] ==target){    
                return i;    
            }    
        }    
        return -1;    
	}
}
