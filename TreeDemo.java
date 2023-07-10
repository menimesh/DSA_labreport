//queue for tree
class QueueNode{
	QueueNode next;	TreeNode info;
	QueueNode(){
		next = null;
	}
	QueueNode(TreeNode el){
		info = el; next = null;
	}
}
class MyQueue{
	QueueNode front; 	QueueNode rear;
	int size;
	MyQueue(){
		front = null; rear = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return front == null;
	} 
	
	public void enqueue(TreeNode el){
		QueueNode xyz = new QueueNode(el);
		if(front==null){
			rear=front=xyz;
			
		}else{
			rear.next=xyz; rear = xyz;
		}
		size++;
	}
	
	public TreeNode dequeue(){
		TreeNode data = null;
		if(front != null ){
			data = front.info;
			front = front.next;
		}
		return data;
	}
}

class TreeNode{
	int info;	TreeNode left;	TreeNode right;
	TreeNode(){
		left = null; right = null;
	}
	TreeNode(int el){
		info=el; left = null; right = null;
	}
}
class Tree{
	public TreeNode root = null;
	TreeNode temp,prev;
	boolean isEmpty(){
		return root==null;
	}
	
	void insert(int el){
		TreeNode xyz = new TreeNode(el);
		if(isEmpty()){
			root = xyz;
		}else{
			temp = root;
			
			while (temp!=null){
				if(xyz.info > temp.info){
					prev = temp;
					temp = temp.right;
				}else{
					prev = temp;
					temp = temp.left;
				}
			}
			if(xyz.info > prev.info ){
				prev.right=xyz;
			}else{
				prev.left = xyz;
			}
		}
	}	
	
	void bft(){
		TreeNode p = root;
		MyQueue q = new MyQueue();
		if(p!=null){
			q.enqueue(p);
			while(!q.isEmpty()){
				p = (TreeNode) q.dequeue();
				visit(p);
				if(p.left != null){
					q.enqueue(p.left);
				}
				if(p.right != null){
					q.enqueue (p.right);
				}
			}
		}
	}
	
	void postorder(TreeNode ptr)
	{
		if(ptr!=null){
			postorder(ptr.left);
			postorder(ptr.right);	
			visit(ptr);
		}
	}
	
	void preorder(TreeNode ptr)	{
		if(ptr!=null){
			visit(ptr);
			preorder(ptr.left);
			preorder(ptr.right);
		}
	}

	void inorder(TreeNode ptr)	{
		if(ptr!=null){		
			inorder(ptr.left);
			visit(ptr);
			inorder(ptr.right);
		}
	}

	static void visit(TreeNode p)
	{
		System.out.print(p.info+" ");
	}
}

class TreeDemo{
	public static void main(String []args){
		Tree ob = new Tree();
		ob.insert(75); ob.insert(50); ob.insert(130);
		ob.insert(30); ob.insert(60); ob.insert(100);
		ob.insert(110); ob.insert(150); ob.insert(55);
		ob.insert(140);
		ob.bft();    System.out.println();
		System.out.print("Postorder: ");
		ob.postorder(ob.root);    System.out.println();
		System.out.print("inorder: ");
		ob.inorder(ob.root);	  System.out.println();
		System.out.print("preorder: ");
		ob.preorder(ob.root);  	System.out.println();
	}
}