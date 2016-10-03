package geeks4geeks;

import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class sparsearray {

	public static void main(String[] args) {
		
		
		
		 Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        
	        String arr[] = new String[n];
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.next().toString();
	        }
	        int m = in.nextInt();
	        String arr1[] = new String[n];
	        HashMap<String,Integer> hm = new HashMap<String,Integer>();
	        for(int arr_i=0; arr_i <= m; arr_i++){
	            arr1[arr_i] = in.next();
	            hm.put(arr1[arr_i],0);
	        }
	         
	        for(int arr_i=0; arr_i <=n; arr_i++){
	            if(hm.containsKey(arr[arr_i]))
	                {
	                hm.put(arr[arr_i],hm.get(arr[arr_i])+1);
	            }
	        }
	        
	        for (Entry<String, Integer> entry : hm.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}
