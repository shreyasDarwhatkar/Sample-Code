package cloudera;

public class MinimumBottles {

	public static void main(String[] args) {
		System.out.println(minimumBottles(12));

	}
	 public static int minimumBottles(int input1)
	    {
		  int [] arr={10,7,5,1};
		  
		  for(int i=0;i<=arr.length-1;i++)
		  {
			  if(arr[i]==input1)
			  {
				  return 1;
			  }
			  if(i==0)
			  {
			   if(arr[i]+arr[i+1]==input1)
				  return 2;
			  else if(arr[i]+arr[i+1]+arr[i+2]==input1)
				  return 3;
			  else if(arr[i]+arr[i+1]+arr[i+2]+arr[i+3]==input1)
				  return 4;  
			  }
			  else if(i==1)
			  {
			   if(arr[i]+arr[i+1]==input1)
				  return 2;
			  else if(arr[i]+arr[i+1]+arr[i+2]==input1)
				  return 3;  
			  }
			  else if(i==2)
			  {
			   if(arr[i]+arr[i+1]==input1)
				  return 2;  
			  }
		  }
	       
		 return 0;
	    }

}
