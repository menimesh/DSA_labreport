class Node{
	Node next;	int info;
	Node(){
		next = null;
	}
	Node(int el){
		info = el;		next = null;
	}
}
class MyQueue_ll{
	Node front; Node rear; int size;
	MyQueue_ll(){
		front = null; rear = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return front == null;
	} 
	
	public void enqueue(int el){
		Node xyz = new Node(el);
		if(front==null){
			rear=front=xyz;
		}else{
			rear.next=xyz;	rear = xyz;
		}
		size++;
	}
	
	public Integer dequeue(){
		Integer data = null;
		if(front != null ){
			data = front.info; front = front.next;
		}
		return data;
	}
	
	public void display(){
		if(isEmpty()){
			return;
		}else{
			Node temp = front;
			System.out.print("your queue : ");
			while(temp != null){
				System.out.print(temp.info+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
class QueueLLDemo{
	public static void main(String []args){
		MyQueue_ll ob = new MyQueue_ll();
		ob.enqueue(1);
		ob.enqueue(2);	ob.enqueue(3);
		ob.enqueue(4);   ob.display();
		
		System.out.print("all queue dequeue :");
		while(!ob.isEmpty()){
			System.out.print(ob.dequeue()+" ");
		}
		System.out.println();
		
		System.out.println("after dequeue :"+ob.dequeue());
	}
}