class DCNode 
{
    public int info;
    public DCNode next; 
    public DCNode prev;
    public DCNode()
    {
        next = null;
        prev = null;
    }
    public DCNode(int el)
    {
        info = el;
        next = null;
        prev = null;
    }    
}
class DCLinkList
{
    public DCNode head, tail;    
    public DCLinkList()
    {
        head =  tail = null;        
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public void addToHead(int el)
    {
        DCNode abc = new DCNode(el);
        if(isEmpty())
        {
            head = tail = abc;
            head.prev = abc;   
            tail.next =abc;
        }
        else
        {
            abc.next = head;
            head.prev = abc;
            tail.next = abc;
            abc.prev = tail;
            head = abc;            
        }
    } 
    public void addToTail(int el)
    {
        DCNode abc = new DCNode(el);
        if(isEmpty())
        {
            head = tail = abc;
            head.prev = abc;   
            tail.next =abc;
        }
        else
        {
            abc.next = head;
            head.prev = abc;
            tail.next = abc;
            abc.prev = tail;
            tail = abc;
        }
    }
    public void deleteAtHead()
    {       
        if(head==tail)
            head = tail = null;
        else
        {
            head = head.next;
            head.prev = tail;
            tail.next = head;  
        }        
    }
    public void deleteAtTail()
    {
        if(head==tail)
            head = tail = null;
        else
        {
            tail = tail.prev;
            head.prev = tail;
            tail.next = head;
        }   
    }
    public void printAll()
    {
        DCNode temp = head;
        System.out.print("tail<-");
        while(temp!=tail)
        {
            System.out.print(temp.info+"<-->");
            temp = temp.next;
        }    
        System.out.println(temp.info+"->head");
    }    
}
class DCLL
{
    public static void main(String[] args) 
    {
        DCLinkList list = new DCLinkList();
        list.addToHead(4); list.addToHead(3);
        list.addToHead(2); list.addToHead(1); 
        list.addToTail(5); list.addToTail(6);
        list.addToTail(7); list.addToTail(8);
        list.addToTail(9); list.addToTail(10);
        System.out.println("Circular Linked : ");
        list.printAll();
        list.deleteAtHead();
		list.printAll();
        list.deleteAtTail();
		list.printAll();
    }
}