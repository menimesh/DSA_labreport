public class InsertionSort 
{
	public static void main(String [] args)
	{
 		int data[] = {2,1,5,0,7,4};
		int i, j,temp;
		for (i=0;i<data.length;i++)
		{
			temp = data[i];
			for(j = i;j>0 && temp<data[j-1];j--)
			{	
				data[j] = data[j-1];
			}                                    
			data[j] = temp;
		}
		System.out.print("Array after sorting: ");
		for(i=0;i<data.length;i++)
			System.out.print(data[i]+" ");
	}
}