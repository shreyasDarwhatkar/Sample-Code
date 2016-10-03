package cloudera;

public class StringPerm {

	public static void main(String[] args) {
		
		permutation("abc","cba");
	}
	public static boolean permutation(String s, String t) {
		if (s.length() != t.length()) {
		 return false;
		 }
		
		 int[] letters = new int[256]; // Assumption
		
		char[] s_array = s.toCharArray();
		 for (char c : s_array) { // count number of each char in s.
			 
			 System.out.println((int)c+" "+letters[c]);
		 letters[c]++;
		 System.out.println(letters[c]);
		 }
		
		 for (int i = 0; i < t.length(); i++) {
		 int c = (int) t.charAt(i);
		 if (--letters[c] < 0) {
		 return false;
		 }
		 }
		
		 return true;
		 }

}
