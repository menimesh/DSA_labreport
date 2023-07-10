//linked list stack
class Node{
	Node next;
	int info;
	Node(){
		next = null;
	}
	Node(int el){
		info = el;
		next = null;
	}
}
class MyStack_ll{
	Node top;
	int size;
	MyStack_ll(){
		top = null;
		size = 0;
	}
	public boolean isEmpty(){
		return top == null;
	} 
	public void push(int el){
		Node xyz = new Node(el);
		if(top==null){
			top=xyz;
		}else{
			xyz.next = top;
			top = xyz;
		}
		size++;
	}
	public Integer pop(){
		if(top == null ){
			return null;
		}else{
			Node ptr = top;
			top = top.next;
			size--;
			return ptr.info;
		}
	}
	public void display(){
		if(isEmpty()){
			return;
		}else{
			Node temp = top;
			System.out.print("your stack : ");
			while(temp != null){
				System.out.print(temp.info+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
}
class StackLLDemo{
	public static void main(String []args){
		MyStack_ll ob = new MyStack_ll();
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		ob.display();
		
		System.out.print("pop :");
		while(ob.isEmpty()!=true){
			System.out.print(ob.pop()+" ");
		}
		System.out.println();
		
		System.out.println(ob.pop());
	}
}