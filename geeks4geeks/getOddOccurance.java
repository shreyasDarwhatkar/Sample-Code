package geeks4geeks;

public class getOddOccurance {

	public static void main(String[] args) {
		int [] ar={2, 3, 5, 4, 5, 2, 4, 3, 5, 2, 4, 4, 2};
		odd(ar);

	}
	
	public static void odd(int[] ar) {
		
		int res=0;
		for(int i=0;i<ar.length;i++)
		{
			res=res^ar[i];
		}
		System.out.println(res);
	}

}
