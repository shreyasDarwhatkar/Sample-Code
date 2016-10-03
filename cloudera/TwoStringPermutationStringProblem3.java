package cloudera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStringPermutationStringProblem3 {

	public static void main(String[] args) {
		
		if(permutation("abcd","acbdc"))
		{
			System.out.println("Its Anagram");
		}
		else
		{
			System.out.println("Not anagram");
		}
	}
	
	public static String sort(String s) {
		  char[] content = s.toCharArray();
		  java.util.Arrays.sort(content);
		  return new String(content);
		}
		 
		public static boolean permutation(String s, String t) {
		  if (s.length() != t.length())
		    return false;
		 
		  return sort(s).equals(sort(t));
		}

}
