package cloudera;

import java.lang.reflect.Array;
import java.util.Arrays;

public class tripplets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[] = {5, 1, 3, 4, 7};
		 System.out.println(countTriplets(arr, arr.length, 12));
	}
	public static int countTriplets(int arr[], int n, int sum)
	{
	    // Sort input array
	   // sort(arr, arr+n);
		Arrays.sort(arr);
	 
	    // Initialize result
	    int ans = 0;
	 
	    // Every iteration of loop counts triplet with
	    // first element as arr[i].
	    for (int i = 0; i < n - 2; i++)
	    {
	        // Initialize other two elements as corner elements
	        // of subarray arr[j+1..k]
	        int j = i + 1, k = n - 1;
	 
	        // Use Meet in the Middle concept
	        while (j < k)
	        {
	            // If sum of current triplet is more or equal,
	            // move right corner to look for smaller values
	            if (arr[i] + arr[j] + arr[k] == sum){
	                //k--;
	            	System.out.println(arr[i]+" " +arr[j]+ " "+ arr[k]);
	            	break;
	            	}
	            else if(arr[i] + arr[j] + arr[k] > sum)
	            	k--;
	            // Else move left corner
	            else
	            {
	                // This is important. For current i and j, there
	                // can be total k-j third elements.
	                ans += (k - j);
	                j++;
	            }
	        }
	    }
	    return ans;
	}
	 


}
