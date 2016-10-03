package cloudera;

public class mergeSortNew {

	public static void main(String[] args) {
		int [] arr={9,8,6,5,1,7};
		mergersort(arr, arr.length);
		for(int m=0;m<=arr.length-1;m++)
		{
			System.out.println(arr[m]);
		}


	}
	public static void mergersort(int[] arr,int len)
	{
		int nr=0;
		if(len<2)
			return;
		int mid=len/2;
		int []left=new int[mid];
		int []right=new int[len-mid];
		for(int i=0;i<=mid-1;i++)
		{
			left[i]=arr[i];
		}
		for(int j=mid;j<=len-1;j++)
		{
			right[nr]=arr[j];
			nr++;
		}
		mergersort(left,left.length);
		mergersort(right,right.length);
		sort(left, right, arr);
	}
	
	public static void sort(int[] left,int[] right,int [] original)
	{
		int leftLen=left.length;
		int rightLen=right.length;
		int origLen=original.length;
		int i=0,j=0,k=0;
		
		while(i<leftLen && j<rightLen)
		{
			if(left[i]<=right[j])
			{
				original[k]=left[i];
				i=i+1;
			}
			else
			{
				original[k]=right[j];
				j=j+1;
			}
			k=k+1;
		}
		while(i<leftLen)
		{
			original[k]=left[i];
			i=i+1;
			k=k+1;
		}
		while(j<rightLen)
		{
			original[k]=right[j];
 			j=j+1;
			k=k+1;
		}
		
		
		
		
	}

}
