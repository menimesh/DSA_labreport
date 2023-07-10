class MyStack 
{
	private int size; 
	private char[] stck; 
	private int top;
	
	public MyStack(int s){
		size = s;
		stck = new char[size]; 
		top = -1;
	}
	
	public void push(char el) {
		if(top == size - 1)
			System.out.println("Stack Overflow");	
		else
		{
			
			stck[++top] = el; 
		}
	}
	
	public char pop() {
		if(top == -1)
		{
			throw new IndexOutOfBoundsException("stack out of bound");
		}
		int temp = top;
		top = top-1;
		return stck[temp];
	}
	
	public int topEl(){
		return stck[top]; 
	}
	
	public boolean isEmpty(){
		return (top == -1); 
	}
	
	public boolean isFull(){
		return (top == size - 1); 
	}
	
	public static void main(String[] args) 
	{
		String s = "[5]*(4+3){3erq}{3qrq43r}/*1231*/{}{(]}";
		MyStack ob = new MyStack(s.length()); 		
		
		boolean f = false;
		for (int i=0; i < s.length(); i++){
		  char ch = s.charAt(i);
		  if((ch == '(' || ch == '[' || ch == '{')&& f==false){
			ob.push(ch);
		  }else if((ch == ')'||ch == '}'|| ch == ']')&&f==false){
			while(!ob.isEmpty()){
			  char c = ob.pop();
if((c == '{'&& ch == '}')||(c == '['&&ch == ']')||(c        == '(' && ch == ')')){
				break;
			  }
			}
		  }else if((ch == '/' && s.charAt(i+1)=='*')|| f==true){
			f=true;
			try{
				if(s.charAt(i+2)!= '*' && s.charAt(i+3)!='/'){
					continue;
				}else{
					i=i+3;
					f=false;
				}
			}catch(Exception e){}
		  }
		}
		if(f==false){
			System.out.println("no error from comment");
		}else{
			System.out.println("error no comment ending");
		}
		if(ob.isEmpty()){
			System.out.println("success");
		}else{
			System.out.println("failed");
		}}}