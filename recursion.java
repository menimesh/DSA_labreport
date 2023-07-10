class recursion{
	static int fab(int n){
			if(n<=1)
				return n;
			else{
				return (fab(n-1)+fab(n-2));
			}
	}
	
	static int multiple(int a,int b){
		if(b==1){
			return a;
		}else{
			return (a+multiple(a,b-1));
		}
	}
	public static void main(String []args){
		
		System.out.println(fab(6));
		System.out.println(multiple(5,5));
	}
}