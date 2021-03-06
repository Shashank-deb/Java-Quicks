class Node
{
	String data;
	Node next;
	Node(String data)
	{
		this.data=data;
	}
}
class LinkedListString 
{
	public static void main(String[] args) 
	{
		Node n1=new Node("shashank");
		Node n2=new Node("amul");
		Node n3=new Node("abhishek");
		Node n4=new Node("anshul");
		Node n5=new Node("manas");
		Node head=n1;
		head.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		n5.next=null;
		//System.out.println("The element in linked list is having string: ");
		//traverse(head);
		//System.out.println("This is insertion operation : ");
		//insert("amulya",head,2);
		//traverse(head);
		//System.out.println("This is deletion operation: ");
		//delete(head,2);
		//traverse(head);
		System.out.println(count(head));
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
	static void insert(String data,Node head,int pos)
	{
		Node t=new Node(data);
		if(pos==0)
		{
			t.next=head;
			head=t;
			return;
		}
		Node prev=head;
		for(int i=1;i<pos-1;i++)
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
			return ;
		}
		Node prev=head;
		for(int i=0;i<pos-1;i++)
		{
			prev=prev.next;
		}
		prev.next=prev.next.next;
	}
	static int count(Node head)
	{
		int cnt=0;
		Node cur=head;
		while(cur!=null)
		{
			cnt++;
			cur=cur.next;
		}
		return cnt++;
	}
	static void rcount(Node head)
	{
		Node cur=head;
		while(cur!=null)
		{
		   System.out.println(cur.data+1);
		   cur=cur.next;
		}
		
	}

}
