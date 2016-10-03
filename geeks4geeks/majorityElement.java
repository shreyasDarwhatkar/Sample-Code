package geeks4geeks;

public class majorityElement {

	public static void main(String[] args) {
		int [] a={3,3,4,2,4,4,2,4,4};
		findMajority(a);

	}
	public static void findMajority(int[] arr)
	{
		int maj=0,count=1;
		for(int i=1;i<arr.length;i++)
		{
			if(arr[maj]==arr[i])
			{
				count++;
			}
			else
				count--;
			if(count==0)
			{
				maj=i;
				count=1;
			}
		}
		System.out.println(arr[maj]);
	}

}
