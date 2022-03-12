class QueueImplementation
{
	//fifo(first in first out)
	int front;
	int rear;
	int capacity;
	int [] queue;
	QueueImplementation()
	{
		capacity=5;
		front=-1;
		rear=-1;
		queue=new int[capacity];
	}
	public boolean isEmpty(){
		return rear<=front;
	}
	public int enqueue(int data)
	{
		return queue[++rear]=data;
	}
	public int dequeue(){
		if(isEmpty())
		{
			System.out.println("Queue is empty");
		}
		if(rear>=front)
		{
			return queue[++front];
		}
			return (Integer)null;
		
	}
	public int size(){
		return rear-front;
	}
}
public class Queue 
{
	public static void main(String[] args) 
	{
		QueueImplementation q=new QueueImplementation();
		System.out.println(q.isEmpty());
		q.enqueue(18);
		q.enqueue(34);
		q.enqueue(6);
		System.out.println(q.isEmpty());
		System.out.println(q.dequeue());
	}
	
}
