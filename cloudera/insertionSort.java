package cloudera;

public class insertionSort {

	public static void main(String[] args) {

		int [] arr={9,8,6,5,1,7};
		iSort(arr, arr.length);

	}
	
	public static void iSort(int[] arr,int len)
	{int value=0;
	int hole=0;
		for(int i=1;i<=len-1;i++)
		{
			hole=i;
			value=arr[i];
			 
			while(hole>0 && arr[hole-1]>value)
			{
				arr[hole]=arr[hole-1];
				hole=hole-1;
			}
			arr[hole]=value;
		}
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
