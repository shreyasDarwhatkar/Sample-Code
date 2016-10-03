package cloudera;

public class customisedBinarySearch {

	public static void main(String[] args) {
		//System.out.println("Program started");
		int[] arry={1,3,5,6,7,8,9};
		int first=0,last=arry.length-1,middle=0,search=3;
		middle=(first+last)/2;
		while(first<=last)
		{
			if(search<arry[middle])
			{
				last=middle-1;
				middle=(first+last)/2;
			}
			else if(search>arry[middle])
			{
				first=middle+1;
				middle=(first+last)/2;
			}
			else if(search==arry[middle])
			{
				System.out.println("The position of the element is "+(middle+1));
				break;
			}
			
		}
		
		

	}

}
