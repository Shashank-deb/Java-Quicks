import java.util.PriorityQueue;
public class Kthlargest2 
{
	//declaring the fields as static data members
	private static int k;
    private PriorityQueue<Integer> min_heap;
    public Kthlargest2(int k, int[] nums) {
        this.k=k;
		//creation of object of min_heap
        min_heap=new PriorityQueue<>();
        for(int num:nums){
            min_heap.offer(num);
        }
		//pop the value from heap till the size became nums.length==k
        while(min_heap.size()>k){
            min_heap.poll();
        }
    }
    
    public int add(int val) {
        min_heap.offer(val);
		//pop the value from heap till the size became nums.length==k
        if(min_heap.size()>k){
            min_heap.poll();
        }
		//at the end return the heap top element which is the k largest element 
		//for the given number present in the nums array
        return min_heap.peek();
    }
	public static void main(String[] args) 
	{
		int nums []={4,5,8,2};
		int k=3;
        Kthlargest2 largest=new Kthlargest2(k,nums);
		System.out.println(largest.add(3));
		System.out.println(largest.add(5));
		System.out.println(largest.add(10));
		System.out.println(largest.add(9));
		System.out.println(largest.add(4));
	}
}
