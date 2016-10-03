package cloudera;

public class StringPermutation {

	public static void main(String[] args) {
		
		permutation("", "abc");

	}

	 private static void permutation(String prefix, String str){
	        int n = str.length();
	        if (n == 0) 
	            System.out.println(prefix);
	        else {
	            for (int i = 0; i < n; i++)
	            {
	            	String Fstring=str.substring(0, i);
	            	String sString=str.substring(i+1);
	                permutation(prefix + str.charAt(i), 
	                str.substring(0, i) + str.substring(i+1));
	            }
	        }
	    }
}
