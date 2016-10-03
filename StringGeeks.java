import java.util.HashMap;


public class StringGeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//permutation("", "AB");
		//permutationunique("", "ABC");
		getSentence("thehouseisblue");

	}
	 private static void permutation(String prefix, String str){
	        int n = str.length();
	        if (prefix.length()==str.length()) {
	            System.out.println(prefix);
	        return;}
	       
	            for (int i = 0; i < n; i++){
	            	//System.out.println(prefix +str.charAt(i)+"," + str.substring(0, i) + str.substring(i+1));
	            	//String tt=str.substring(0, i) ;
	               // permutation(prefix + str.charAt(i), 
	            //str.substring(0, i) + str.substring(i+1));
	            	permutation(prefix+str.charAt(i),str);
	        	            //str.substring(0, i) + str.substring(i+1));
	                }
	        
	    }
	 
	 private static void permutationunique(String prefix, String str){
	        int n = str.length();
	        if (n==0) {
	            System.out.println(prefix);
	        }
	       
	            for (int i = 0; i < n; i++){
	            	//System.out.println(prefix +str.charAt(i)+"," + str.substring(0, i) + str.substring(i+1));
	            	//String tt=str.substring(0, i) ;
	                permutationunique(prefix + str.charAt(i), 
	            str.substring(0, i) + str.substring(i+1));
	            	//permutation(prefix+str.charAt(i),str);
	        	            //str.substring(0, i) + str.substring(i+1));
	                }
	        
	    }
	 
	 private static void getSentence( String str)
	 {
		HashMap<String, String> dict=new HashMap<String, String>();
		StringBuilder sb=new StringBuilder();
		StringBuilder sb1=new StringBuilder();
		dict.put("the","the");
		dict.put("house","house");
		dict.put("is","is");
		dict.put("blue","blue");
		int i=0,j=1;
		
		String[] arrStr=str.split("");
		sb1.append(arrStr[i]);
		while(j<=str.length())
		{
			sb1.append(arrStr[j]);
			if(dict.containsKey(sb1.toString()))
			{
				sb.append(sb1.toString());
				sb.append(" ");
				if(j>=str.length())
					break;
				j++;
				i=j;
				j=i+1;
				sb1.setLength(0);
				sb1.append(arrStr[i]);
			}
			else
			{
				//i++;
				j++;
			}
			
		}
		System.out.println(sb.toString());
		
	 }

}
