public class Stack 
{
    //IMPLEMENT STACK USING QUEUE
	//steps implement stack using queue
	//1.adding x->q2
	//2.element of q1 goes to q2
	//3.swap(q1<->q2)
	//4.pop()
	//remove the top element in q1
	public static void main(String[] args) 
	{
		
	}
	static void push(int x)
	{
		q1.push(x);
	}
	while(!q1.empty())
	{
		q2.push(q1.front());
		q1.pop();
	}
	swap(q1,q2);






	//steps using single array
	//1.push the element into the stack
	//2.if size=2 so size-1 element means one top element go to push again
	//3.same process is occur multiple times
	push(int x)
	{
		q1.push(x);
		for(int i=0;i<q.size()-1;i++)
		{
			q1.push(q1.top());
			q1.pop();
		}
	}
	pop(){
		q1.pop();
	}
	top(){
		q1.top();
	}

}
