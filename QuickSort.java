
public class QuickSort {

	public static void main(String[] args) {
		int [] arr={9,8,6,5,1,7,0};
		qSort(arr,0, arr.length-1);
		for(int m=0;m<=arr.length-1;m++)
		{
			System.out.println(arr[m]);
		}

	}
	
	public static void qSort(int []arr,int start,int end)
	{
		if(start<end)
		{
			int pindexx=partition(arr, start, end);
			qSort(arr, start,pindexx-1);
			qSort(arr, pindexx+1, end);
			
		}
		
	}
	
	public static int partition(int []arr,int start,int end)
	{
		int pindex=start;
		int pivot=arr[end];
		int temp=0;
		for(int i=start;i<=end-1;i++)
		{
			if(arr[i]<pivot)
			{
				temp=arr[i];
				arr[i]=arr[pindex];
				arr[pindex]=temp;
				pindex=pindex+1;
			}
		}
		temp=arr[end];
		arr[end]=arr[pindex];
		arr[pindex]=temp;
		return pindex;
	}

}
