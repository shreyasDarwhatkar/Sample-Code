
public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int arr[] = {1,2,3};
        int n = arr.length;
        int sum = 23;
        maxLength(arr, sum);

	}
	static int maxLength(int[] a, int k) {
	     return subArraySum(a,a.length,k); 
	    }
	
	static int subArraySum(int arr[], int n, int sum) 
    {
        int curr_sum, i, j;
        int maxLength = 0; 
        int leng = 0;
 
        // Pick a starting point
        for (i = 0; i < n; i++) 
        {
            curr_sum = arr[i];
 
            // try all subarrays starting with 'i'
            for (j = i + 1; j <= n; j++) 
            {
                if (curr_sum <= sum) 
                {
                    int p = j - 1;
                    leng = p-i;
                    if(leng >= maxLength){
                    	maxLength = leng;
                    }
                    
                }
                if (curr_sum > sum || j == n)
                    break;
                curr_sum = curr_sum + arr[j];
            }
        }
        return maxLength;
    }

}
