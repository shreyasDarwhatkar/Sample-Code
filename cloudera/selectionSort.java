package cloudera;

public class selectionSort {

	public static void main(String[] args) {
		
		int [] arr={9,8,6,5,1,7};
		sSort(arr, arr.length);

	}
	
	public static void sSort(int[] arr,int len)
	{
		for(int i=0;i<=len-1;i++)
		{
			int min=arr[i];
			for(int j=i+1;j<=len-1;j++)
			{
				if(arr[j]<arr[i])
				{
					min=arr[j];
					arr[j]=arr[i];
					arr[i]=min;
				}
			}
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
		
	}

}
