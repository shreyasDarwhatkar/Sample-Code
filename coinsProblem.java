public class coinsProblem {

	public static void main(String[] args) {

		int []arr={1,1,0,1,0,0};
		int []arr1={1,0,0,};
		System.out.println(solution(arr1,arr1.length));

	}

	public static int solution(int[] a, int length) {
		int result = 0;
		int n = length;
		int i;
		for (i = 0; i < n-1; i++) {
			if (a[i] == a[i + 1]) {
				result = result + 1;
			}
		}
		System.out.println("result= " +result);
		int r = 0;
		for (i = 0; i < n; i++) {
			int count = 0;
			if (i > 0) {
				if (a[i - 1] != a[i]) {
					count = count + 1;
				} else {
					count = count - 1;
				}

			}
			
			if(i<n-1)
			{
				if(a[i+1]!=a[i])
				{
					count=count+1;
				}
				else
					count=count-1;
			}
			
			//System.out.println("count= " +count);
			if(count>r)
				r=count;
			
		}
		
		return result+r;
	}

}
