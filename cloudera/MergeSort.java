package cloudera;

import javax.swing.text.NavigationFilter;

public class MergeSort {

	public static void main(String[] args) {
		int [] arr={9,8,6,5,1,7};
		mergeSort(arr);
	}
	
	
	public static  void mergeSort(int[] A)
	{
		int nA=A.length;
		if(nA<2)
		{
			return;
		}
		int mid=nA/2;
		int [] left=new int[mid];
		int [] rigth=new int[nA-mid];
		for(int i=0;i<=mid-1;i++)
		{
			left[i]=A[i];
			//System.out.println(left[i]);
		}
		int j=0;
		for(int l=mid;l<nA;l++)
		{
			
			rigth[j]=A[l];
			//System.out.println(rigth[j]);
			j++;
		}
		mergeSort(left);
		mergeSort(rigth);
		Merge(left, rigth, A);
	}
	
	public static void Merge(int[] left,int[] right,int[] mergingArray)
	{
		int nl=left.length;
		int nr=right.length;
		int i=0,j=0,k=0;
		while(i<nl && j<nr)
		{
			if(left[i]<=right[j])
			{
				mergingArray[k]=left[i];
				k++;
				i++;
			}
			else 
			{
				mergingArray[k]=right[j];
				k++;
				j++;
			}
			
		}
		while(i<nl)
		{
			mergingArray[k]=left[i];
			i++;
			k++;
		}
		while(j<nr)
		{
			mergingArray[k]=right[j];
			j++;
			k++;
		}
		
		for(int m=0;m<mergingArray.length;m++)
		{
			System.out.println(mergingArray[m]);
		}
		
	}

}
