package cloudera;

public class BubbleSort {

	public static void main(String[] args) {

		int [] arr={9,8,6,5,1,7};
		bSort(arr, arr.length);

	}
	
	public static void bSort(int [] arr,int len)
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			int flag=0;
			for(int j=0;j<=arr.length-i-2;j++)
			{
				int temp=0;
				if(arr[j+1]<arr[j])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
					flag=1;
				}
			}
			if(flag==0)
			{
				break;
			}
		}
		
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
