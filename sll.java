class Node {
	public int info;	public Node next;
public Node(){
		next=null;
	}
	public Node(int el){
		info = el;	next=null;
	}
	public Node (int el,Node ptr){
		info = el;	next = ptr;
	}
}
class sll_addToHead{
	public Node head=null;//first initiation of head tail
	public Node tail=null;
	
	void addToHead(int el){//add to head 
		Node xyz= new Node(el);
		if (head == null){
			head = xyz;
			tail = xyz;
		}
		else{
			xyz.next=head;
			head = xyz;
		}
	}
	
	void addToAnyPos(int el,int pos){
		Node xyz = new Node(el);
		if(head==null){
			head=tail=xyz;
		}else{
			int i = 0;
			Node tmp = head;
			Node p=null;
			while (i!=pos){
				p=tmp;
				tmp=tmp.next;
				i++;
			}
			xyz.next=p.next;
			p.next=xyz;
		}
	}
	
	void addToLast(int el){
		Node xyz = new Node(el);
		if(head==null){
			head=tail=xyz;
		}else{
			Node tmp = head;
			Node prev = null;
			while(tmp!=null){
				prev = tmp;
				tmp = tmp.next;
			}
			prev.next=xyz;
			tail = xyz;
		}
	}
	
	void deleteFromAnyPos(int pos){
		int count =0;
		Node current = head;
		Node previous=null;
		while(count!=pos){
			previous=current;
			current=current.next;
			count++;
		}
		previous.next=current.next;
		current.next=null;
	}
	
	void deleteFromTail(){
		Node tmp = head;
		Node prev = null;
		while(tmp.next != null){
			prev = tmp;
			tmp = tmp.next;
		}
		prev.next = null;
		tail = prev;
	}
	
	
}
class DisplayLinkList{
	public void display(Node head){//to display the link list
		Node current = head;
		if ( current == null){
			System.out.println("list is empty");
			return;
		}
		System.out.print("Nodes of sll are :");
		while ( current != null){
			System.out.print(current.info+" ");
			current = current.next;
		}
		System.out.println();
	}
}

class sll{
	public static void main(String []args){
		sll_addToHead ob = new sll_addToHead();
		ob.addToHead(1);
		ob.addToHead(2);
		ob.addToHead(3);
		ob.addToHead(4);
		
		DisplayLinkList obj = new DisplayLinkList();		
		obj.display(ob.head);
		
		ob.addToAnyPos(7,2);
		obj.display(ob.head);
		
		ob.deleteFromAnyPos(1);
		obj.display(ob.head);
		
		ob.addToLast(100);
		obj.display(ob.head);
		
		ob.deleteFromTail();
		obj.display(ob.head);
	}
	
}