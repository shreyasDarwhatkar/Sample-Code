
public class maxWOadjacency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] arr = {10, 20, 30, 40};
		 //getMaxsum(arr);
		 //getMaxdiff(arr);
		 //getproductArray(arr);
		 //getEquiArrayIndex(arr);
		 //getSmall(arr);
		 //getmaxDiffindex(arr);
		 //getminimumDist(arr, 1 ,2);
		 isBiotonic(arr);

	}
	
	public static void getMaxsum(int[]arr)
	{
		int prev1=arr[0];
		int prev2=Math.max(arr[0],arr[1]);
		for(int i=2; i<arr.length; i++)
		{
			int temp=Math.max(prev1+arr[i],prev2);
			prev1=prev2;
			prev2=temp;
		}
		System.out.println(prev2);		
	}
	
	public static void getMaxdiff(int[]arr)
	{
		int min=arr[0];
		int max=0;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]-min>max)
			{
				max=arr[i]-min;
			}
			
		}
		
		System.out.println(max);
				
	}
	public static void getproductArray(int[]arr)
	{
		int[]left=new int[arr.length];
		int[]right=new int[arr.length];
		left[0]=1;
		right[arr.length-1]=1;
		for(int i=1;i<arr.length;i++)
		{
			left[i]=left[i-1]*arr[i-1];
		}
		for(int j=arr.length-2;j>=0;j--)
		{
			right[j]=right[j+1]*arr[j+1];
		}
		for(int k=0;k<arr.length;k++)
		{
			arr[k]=right[k]*left[k];
			System.out.println(arr[k]);
		}
		
	}
	
	public static void getEquiArrayIndex(int[]arr)
	{
		int[]left=new int[arr.length];
		int[]right=new int[arr.length];
		left[0]=arr[0];
		right[arr.length-1]=arr[arr.length-1];
		for(int i=1;i<arr.length;i++)
		{
			left[i]=left[i-1]+arr[i];
		}
		for(int i=arr.length-2;i>=0;i--)
		{
			right[i]=right[i+1]+arr[i];
		}
		
		for(int k=0;k<arr.length;k++)
		{
			if(left[k]==right[k])
			{
				System.out.println(k);
			}
		}
		
	}
	
	public static void getSmall(int[]arr)
	{
		int s=arr[0];
		for(int a:arr)
		{
			if(arr[0]==0)
			{
			if (a!=s)
			{
				System.out.println(s);
				break;
			}
			s++;
			}
			else
			{
				System.out.println(0);
				break;
			}
		}
		System.out.println(s);
	}
	
	public static void getmaxDiffindex(int [] arr)
	{
		int max=-1;
		int i=0,j=arr.length-1;
		while(i<j)
		{
			if(arr[j] > arr[i] && j-i>=0)
			{
				max=Math.max(max,j-i);
			}
			if(arr[j-1]>=arr[i])
			{
				j--;
			}
			else
			{
				i++;
			}
			
		}
		System.out.println(max);
	}
	
	public static void getminimumDist(int arr[],int x,int y)
	{
		int i=0,j=1,min=Integer.MAX_VALUE;
		
		
		while(i<=arr.length-1 && j<=arr.length-1)
		{
			if((arr[i]==x||arr[i]==y) && ((arr[j]==x||arr[j]==y)))
			{
				
				
				if(min>j-i)
					min=j-i;
				i=j;
				j++;
			
			}
			else if(arr[i]==x||arr[i]==y)
			{
				j++;
			}
			else if(arr[j]==x||arr[j]==y)
			{
				i++;
			}
			
			else
			{
				i++;
				j++;
			}
		}
		System.out.println(min);
	}
	
	public static void isBiotonic(int [] arr)
	{
	 boolean c1=false,c2=false,c3=false;
	 int startIndx=0,endIndx=0;
	 for(int i=0;i<arr.length-1;i++)
	 {
		 if (c1==false && c2==false && c3==false) {
			if (arr[i] < arr[i + 1]) {
				c1 = true;
				startIndx = i;
				endIndx=i+1;
			}
			
		}
		 else if(c1==true && c2==false && c3==false )
		 {
			 if (arr[i] > arr[i + 1]) {
					c2 = true;
					endIndx=i+1;
				}
			 
		 }
		 else if(c1==true && c2==true && c3==false )
		 {
			 if (arr[i] < arr[i + 1]) {
				    c3=true;
					endIndx=i;
					break;
				} 
			 
		 }
		 
	 }
	 
	 if(c1==true && c2==true && c3==false && endIndx<arr.length-1)
	 {
		 endIndx=arr.length-1;
	 }
		 
	 for(int i=startIndx;i<=endIndx;i++)
	 {
		 System.out.println(arr[i]);
	 }
		
	}
	
	
	

}
