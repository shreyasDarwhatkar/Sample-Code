import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated meth
		TestClass tc =new TestClass();
		System.out.println(buildSubsequences("abc"));
		}
	
	static String[] buildSubsequences(String s) {
	    long numSubsets = 1L << s.length();
	    List<String> lstStrings= buildSubset(s, numSubsets - 1);
	    Collections.sort(lstStrings);
	    String [] array = lstStrings.toArray(new String[lstStrings.size()]);
	    for(String a: array){
	    	System.out.println(a);
	    }
	    return array;
	    
	}
	
	static List<String> buildSubset(String s, long length) {
	    if (length < 0) {


	        return new ArrayList<>();
	    }
	    StringBuilder subset = new StringBuilder();
	    for (int i = 0; i < s.length(); i++) {

	        if (isSet(length, i)) {
	            
	            subset.append(s.charAt(i));
	        }
	    }
	    List<String> combinations = buildSubset(s, length - 1);
	   if(!subset.toString().isEmpty()){
	    combinations.add(subset.toString());
	    }
	    return combinations;
	}

	static boolean isSet(long bits, int i) {
	   
	    return (bits & (1L << i)) != 0;
	}
		
		
	
	
	
}
