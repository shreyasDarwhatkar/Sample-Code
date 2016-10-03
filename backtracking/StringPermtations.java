package backtracking;

public class StringPermtations {		 
	    static int count=0;
	    public static void main(String[] args) 
	    {
	        String s = "abc";
	        count=0; // counter to count the number of words formed
	        permute (s.toCharArray(), 0);
	    }
	 
	    static void permute(char[] s, int i) 
	    {
	        if (i==s.length-1)
	        {
	            count++; // count no of words output and print the permutation.
	            System.out.println(count + ") " + new String(s));
	            return;
	        }
	        int curr = i;
	        for (; i<s.length; i++)
	        {
	            swap (s, i, curr);
	            permute (s, curr+1);
	            swap (s, i, curr);
	        }
	    }
	 
	    static void swap(char[] s, int i, int j) 
	    {
	        char c = s[i];
	        s[i] = s[j];
	        s[j] = c;
	    }
	 
	}


