import java.util.*;


public class Hack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(missingWords("I am Using HackerRank","I HackerRank"));
	}
	
	static String[] missingWords(String s, String t) {
        String[] sArray = s.split(" ");
        String[] tArray = t.split(" ");
        Set<String> set = new HashSet<String>();
        for(String e : sArray){
            set.add(e);
        }
    
        List<String> list = new ArrayList<String>();
        
        for(String e : tArray){
           // System.out.println(e);
            if(!set.contains(e)){
            	 list.add(e);
            }
        }
        
        System.out.print(list.size());
        String[] res = new String[list.size()];
        list.toArray(res);
        return res;
    }

}
