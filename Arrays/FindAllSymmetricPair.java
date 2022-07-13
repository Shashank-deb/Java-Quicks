import java.util.HashMap;
public class FindAllSymmetricPair 
{
	public static void main(String[] args) 
	{
		int [][] arr={
			      				      
		      {1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}

		};
		f2(arr);
	}

	//This is bruteforce approach Time complexity-o(n^2)
	static void f1(int [][] arr){
		int n=arr.length;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(arr[j][0]==arr[i][1] && arr[j][1]==arr[i][0]){
					System.out.println("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
					break;
				}
			}
		}
	}


	//This is solved by using HashMap which make time complexity-o(1)
	static void f2(int [][] arr ){
		int n=arr.length;
		HashMap<Integer,Integer> map=new HashMap<>();
		for(int i=0;i<n;i++){
			int first=arr[i][0];
			int second=arr[i][1];
			if(map.get(second)!=null && map.get(second)==first){
				System.out.println("("+first+"  "+second+")"+" ");
			}
			else{
				map.put(first,second);
			}
		}
		
	}

}
