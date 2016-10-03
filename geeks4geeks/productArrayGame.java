package geeks4geeks;

import java.util.Arrays;

public class productArrayGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={2,5,1,2,4,1,6,5,2,2};
		//product(arr);
		//boolean fag=true;
		System.out.println(getmax(arr, 6));
	}
	
	public static void product(int[] arr) {
		int []left= new int[arr.length];
		int []right=new int[arr.length];
		left[0]=1;
		right[arr.length-1]=1;
		System.out.println("/******left array********/");
		for(int i=1;i<arr.length;i++)
		{
			
			left[i]=arr[i-1]*left[i-1];
			System.out.println(left[i]);
		}
		System.out.println("***************right Array*************");
		for(int j=arr.length-2;j>=0;j--)
		{
			right[j]=arr[j+1]*right[j+1];
			System.out.println(right[j]);
		}
		System.out.println("***************Final Array*************");
		for(int k=0;k<arr.length;k++)
			System.out.println(left[k]*right[k]);
	}
	public static int getmax(int[] input1,int input2) {
		boolean flag=true;
        Arrays.sort(input1);
        int[] aMax = Arrays.copyOfRange(input1, input1.length-input2,input1.length);
        
        for(int i=aMax.length-2;i>=0;i--)
        {
            if(aMax[i+1]>aMax[i])
            {
                flag=false;
                break;
            }
        }
        if(flag)
        {
            return 0;
        }
        else
        {
            return input2;
        }
		
	}

}
