package assignments;

public class CountingElementWithoutDuplicate {
	
	public static int countElements(int[] arr,int n)
	{
		int i,j;
		int count=0;
		for( i=0;i<n;i++)
		{
			for( j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
					break;
			}
			if(i==j)
				count++;
		}
		return count;
	}

	public static void main(String[] args)
	{
		int arr[]= {10,20,10,20,30,40,40,40,10,50};
		int n=arr.length;
		System.out.println(countElements(arr,n));
		
	}
}

