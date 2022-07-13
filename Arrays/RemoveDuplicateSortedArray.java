import java.util.HashSet;
public class RemoveDuplicateSortedArray 
{
	public static void main(String[] args) 
	{
		 int [] nums={1,1,1,2,3};
		 int k=f1(nums);
		 for(int i=0;i<k;i++){
			System.out.println(nums[i]);
		 }
	}

     //This is solved by using Set Interface HashSet Class
	//Time complexity: O(n*log(n))+O(n)
	//   Space Complexity: O(n)
	static int f1(int [] nums){
		HashSet<Integer> ds=new HashSet<>();
		int n=nums.length;
		for(int i=0;i<n;i++){
			ds.add(nums[i]);
		}

		int index=0;
		int k=ds.size();
		for(int x:ds){
			nums[index++]=x;
		}
		return k;
	}

	//This is solved by using two pointer approach know as inplace 
	static int f2(int [] arr){
		int i = 0;
        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return i + 1;
	}
}
