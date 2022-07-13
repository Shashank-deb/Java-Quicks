import java.util.ArrayDeque;
class ArrayDequeCf 
{
	public static void main(String[] args) 
	{
		//the type of queue is double queue
		//both side insertion and deletion
		//used in sliding window approach
     ArrayDeque<Integer> adq=new ArrayDeque<>();
	 adq.offer(23);
	 adq.offerFirst(12);
	 adq.offerLast(45);
	 adq.offer(67);
	 System.out.println(adq);



     //peek
	 System.out.println(adq.peek());
	 System.out.println(adq.peekFirst());
     System.out.println(adq.peekLast());
     System.out.println(adq);



	 //poll
	 System.out.println(adq.poll());
	  System.out.println(adq);
	 System.out.println(adq.pollFirst());
	  System.out.println(adq);
	 System.out.println(adq.pollLast());
	  System.out.println(adq);
	 System.out.println(adq);



	}
}
