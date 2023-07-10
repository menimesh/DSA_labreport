public class SelectionSort {
	public static void main(String [] args)
	{
 		int data[] = {2,1,5,0,7,4};
		int i, j, least, temp;
		for (i=0;i<data.length-1;i++){	
			for(j=i+1,least=i;j<data.length;j++)
			{	if(data[j] < data[least])
					least = j;
			}                                    
			if(i!=least){
				temp = data[least];
				data[least] = data[i];
				data[i] = temp;
			}
		}
		System.out.print("Array after sorting: ");
		for(i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
	}
}