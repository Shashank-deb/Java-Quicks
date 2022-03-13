import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Comparator;
public class PriorityQueueCf 
{
	public static void main(String[] args) 
	{
		Queue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
		//priority is high of smallest element
		pq.offer(40);
		pq.offer(10);
		pq.offer(20);
		pq.offer(43);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		System.out.println(pq.peek());


		//In priority queue we will have compartor
		//we will convert the min heap to max heap
        System.out.println(pq);

	}
}
