package cloudera;

public class StringProblem1 {

	public static void main(String[] args) {
		 
	        questionOne("abcd");
	}

	
	public static void questionOne(String input) {
        /*-- implement an algorithm to determine if a string has all unique characters. 
         * What if you cannot use additional data structures?   --*/

        boolean[] chars = new boolean[26];
        int x = 0;

        for(int i = 0; i < input.length(); i++) {
        	boolean test=chars[(int)input.toUpperCase().charAt(i) - 64];

            if(!chars[(int)input.toUpperCase().charAt(i) - 64]) {
                chars[(int)input.toUpperCase().charAt(i) - 64] = true;
            }
            else {
                System.out.println("not unique");
                x = -1;
                break;
            }
        }

        if(x == 0)
            System.out.println("unique");
    }

}
