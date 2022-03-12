class StackDemo
{
	int capacity;
	int top;
	int [] stack;
	StackDemo()
	{
		top=-1;
		capacity=10;
		stack=new int[capacity];	
	}
	public boolean isEmpty(){
		
			return top==-1;
	} 
	public boolean isFull(){
		return top==capacity-1;
	}
	public int push(int data)
	{
		if(isFull())
			System.out.println("Stack is Overflow");
		return stack[++top]=data;
	}
	public int pop(){
		if(isEmpty())
			System.out.println("Stack is Underflow");
		return stack[--top];
	}
	public int peek(){
		return stack[top];
	}
    public void display(){
		for(int i:stack)
			System.out.println(i);
    }

}
public class StackImplementation 
{

	public static void main(String[] args) 
	{
		StackDemo s=new StackDemo();
		s.push(10);
		s.push(20);
		System.out.println("Element peek: ");
		System.out.println(s.peek());
		System.out.println("Element pop: ");
		System.out.println(s.pop());
		System.out.println("Checking for empty or not: ");
		System.out.println(s.isEmpty());
		System.out.println("Checking for full or not: ");
		System.out.println(s.isFull());
		System.out.println("This is display method: ");
		s.display();

	}
}
