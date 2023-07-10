class CNode {
	public int info;
	public CNode next;
	public CNode(){
		next = null;}
	public CNode(int el){
		info = el; next = null;
	}    
	public CNode(int el,CNode n){
		info = el;  next = n;
	}
}
class CSll{
	Node head; Node tail; 
	public CSll()
	{
		head = tail = null; 
	}
	boolean isEmpty()
	{ 
		return tail==null;
	}
	void addToFirst (int el){
		Node abc = new Node (el);
		if(isEmpty()){
			head = tail = abc;
			abc.next = head;
		}else{
			abc.next = head;
			tail.next = abc;
			head = abc;
		}
	}
	public void addToAny(int el, int n){
		Node newnode = new Node(el);
		Node temp = head;
		int count=1, position=n;
		while(count < position -1){
			temp = temp.next;count++;
		}
		Node current = temp.next;
		newnode.next = current;
		temp.next = newnode;
	}
	public void addToTail(int el){
		Node newnode = new Node(el);
		Node current = head;
		if(isEmpty()){
			head = tail = newnode;
		} else {
			tail.next = newnode;
			tail= newnode;
			tail.next = head;
		}
	}
	public void deleteAtHead(){
		Node temp = head;
		head = head.next;
		temp.next = null;
		tail.next = head;
	}
	public void deleteAtTail(){
		Node last = head;
		Node previousToLast = null;
		while(last.next != head){
			previousToLast = last;
			last = last.next;
		}
		previousToLast.next = head; 
	}
	public void printAll(){
		Node temp = head;
		while(temp.next!=head){
			System.out.print(temp.info+"->"); 
			temp = temp.next;		
		}	
		System.out.println(temp.info);
	}
}
class CSllDemo{
	public static void main(String []args){
		CSll obi = new CSll();
		obi.addToFirst(1);
		obi.addToFirst(2);
		obi.addToFirst(3);
		obi.printAll();
		obi.addToAny(200,2);
		obi.printAll();
		obi.addToTail(100);
		obi.printAll();
		obi.deleteAtHead();
		obi.printAll();
		obi.deleteAtTail();
		obi.printAll();
	}
}