package geeks4geeks;

public class getMaxDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr={80,2,6,3,100};
		maxDiff(arr);

	}
public static void maxDiff(int[] arr) {
	int max_diff=arr[1]-arr[0];
	int min=arr[0];
	
	for(int i=0;i<arr.length;i++)
	{
		if(max_diff<arr[i]-min)
		{
			max_diff=arr[i]-min;
		}
		if(arr[i]<min)
		{
			min=arr[i];
		}
	}
	System.out.println(max_diff);
	
}
}
