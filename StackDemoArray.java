class StackDemoArray{
	int size;
	int stck[];
	int top;
	StackDemoArray(int s){
		size = s;
		stck = new int[size];
		top = -1;
	}
	void push(int el){
		if(top == size - 1){
			System.out.println("stack over flow");
		}else{
			stck[++top] = el;
		}
	}
	int pop(){
		if(top == -1){
			System.out.println("stack under flow");
			return 0;
		}
		return stck[top--];
	}
	public static void main(String []args){
		StackDemoArray ob = new StackDemoArray(3);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		ob.push(4);
		while(ob.top!= -1){
			System.out.print(ob.pop()+" ");
		}
		int a = ob.pop();
		System.out.println(a);
	}	
}