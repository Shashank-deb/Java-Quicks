class Node
{
	int data;
	Node next;
    Node(int data)
	{
		this.data=data;
	}
}
public class LinkedList 
{
	public static void main(String[] args) 
	{
		Node n1=new Node(10);
		Node n2=new Node(20);
		Node n3=new Node(30);
		Node n4=new Node(40);
		Node n5=new Node(50);
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		//System.out.println("This is traversing of linked list: ");
        //traverse(head);
		//insert(35,head,5);
        //System.out.println("Inserting the element at pos 5: ");
		//traverse(head);
		//delete(head,3);
		//System.out.println("After deleting the element at pos 3: ");
		//traverse(head);
		//reverse(head);
		//System.out.println("Reversing a linked list: ");
		//traverse(head);
		//Recreverse(head);
		//traverse(head);
		//counting the number of nodes
		//System.out.println("Count the node in linked list is: ");
		//System.out.println(count(head));
		//System.out.println("The sum of all the data in linked list is: ");
		//System.out.println(sum(head));
		//System.out.println("The maximum element in the linked list is: ");
		//System.out.println(maximum(head));
		//System.out.println("The minimum element in the linked list is: ");
		//System.out.println(minimum(head));
		//System.out.println("Finding the particular element in linked list: ");
		//System.out.println(search(head,34));
		
	}
	static void traverse(Node head)
	{
	    Node cur=head;
		while(cur!=null)
		{
			System.out.println(cur.data);
			cur=cur.next;
		}
	}

	static void insert(int data,Node head,int pos)
	{
		Node t=new Node(data);
		if(pos==0)
		{
			t.next=head;
			head=t;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.next;
		}
		t.next=prev.next;
		prev.next=t;
		
	}
	static void delete(Node head,int pos)
	{
		if(pos==0)
		{
			head=head.next;
			return;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.next;
		}
		prev.next=prev.next.next;
	}
	static Node reverse(Node head)
	{
	     Node cur=head;
		 Node prev=null;
		 while(cur!=null)
		{
			Node temp=cur.next;
			cur.next=prev;
			prev=cur;
			cur=temp;
		}
		
		return prev;
	}
	static Node Recreverse(Node head){
		if(head==null && head.next==null)
		{
			return head;
		}
		Node newHead=Recreverse(head.next);
		Node headNext=head.next;
		headNext.next=head;
		head.next=null;
		return newHead;

	}
	static int count(Node head)
	{
		Node cur=head;
		int count=0;
		if(cur!=null)
			return count(cur.next)+1;
		else
			return 0;
	}




    //Know as Floyd Algorithm
	//slow will proceed one step 
	//fast will proceed two step
	static Node middle(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}




	//checking the loop in the linkedlist
	static Node detectFirstNode(Node head)
	{
	   Node meet=detectCycle(head);
	   Node fast=head;
	   while(fast!=null & fast.next!=null)
		{
			fast=fast.next;
			meet=meet.next;
		}
		return fast;
	}
	//detect cycle is using floyd cycle detection algorithm
	//if both slow and fast pointer is equal simply return slow(mid)
	//otherwise return null
	static Node detectCycle(Node head)
	{
		Node fast=head;
		Node slow=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				return slow;
			}
		}
		return null;

	}
	static int sum(Node head)
	{
		Node cur=head;
		int sum=0;
		while(cur!=null)
		{
			sum=sum+cur.data;
			cur=cur.next;
		}
		return sum;
	}
	static int maximum(Node head)
	{
		Node cur=head;
		int max=Integer.MIN_VALUE;
		while(cur!=null)
		{
			if(cur.data>max)
				max=cur.data;
			    cur=cur.next;
		}
		return max;
	}
	static int minimum(Node head)
	{
		Node cur=head;
		int min=Integer.MAX_VALUE;
		while(cur!=null)
		{
			if(cur.data<min)
				min=cur.data;
			    cur=cur.next;
		}
		return min;
	}
	static int search(Node head,int key)
	{
		Node cur=head;
		while(cur!=null)
		{
			if(key==cur.data)
				return 1;
			else
				cur=cur.next;
		}
		return 0;
	}
	
	




   
    

}
