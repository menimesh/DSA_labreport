class Node{
	public Node next;
	public Node prev;
	public int info;
	public Node(){
		next=null;
		prev=null;
	}
	public Node (int el){
		next = null;
		prev = null;
		info = el;
	}
}

class InsertionAndDeletion {
	public Node head=null;
	public Node tail=null;
	public void addToHead(int el){
		Node xyz = new Node(el);
		if(head==null){
			head=xyz;
			tail=xyz;
		}else{
			head.prev = xyz;
			xyz.next = head;
			head =xyz;
		}
	}
	
	public void addToTail(int el){
		Node xyz = new Node(el);
		if(head==null){
			head=tail=xyz;
		}else{	
			tail.next=xyz;
			xyz.prev=tail;
			tail=xyz;
		}
	}
	public void deleteFromHead(){
		Node temp = head;
		head=head.next;
		head.prev=null;
		temp.next=null;
	}
	public void deleteFromTail(){
		Node temp = tail;
		tail = tail.prev;
		tail.next=null;
		temp.prev = null;
	}
}
class Traverse{
	public void displayHeadToTail(Node head){
		Node temp = head;
		if(temp==null){
			System.out.println("list is empty");
			return;
		}
		System.out.print("your list head to tail :");
		while(temp != null){ //not temp.next !=null 
			System.out.print(temp.info+" ");
			temp=temp.next;
		}
		System.out.println();
	}
	
	public void displayTailToHead(Node tail){
		Node temp = tail;
		if(temp==null){
			System.out.println("list is empty");
			return;
		}
		System.out.print("your list tail to head :");
		while(temp !=null){
			System.out.print(temp.info+" ");
			temp=temp.prev;
		}
		System.out.println();
	}
	
}
class DllDemo{
	public static void main(String []args){
		InsertionAndDeletion ob = new InsertionAndDeletion();
		Traverse obt = new Traverse();
		
		ob.addToHead(3);
		ob.addToHead(2);
		ob.addToHead(1);
		ob.addToTail(4);
		
		obt.displayHeadToTail(ob.head);
		obt.displayTailToHead(ob.tail);
		
		ob.deleteFromHead();
		System.out.print("after delete from head ");
		obt.displayHeadToTail(ob.head);
		
		ob.deleteFromTail();
		System.out.print("after delete from tail ");
		obt.displayHeadToTail(ob.head);
		
		
	}
}