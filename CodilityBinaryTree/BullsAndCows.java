package CodilityBinaryTree;

public class BullsAndCows {

	public static void main(String[] args) {
		BullsAndCows bc = new BullsAndCows();
		bc.getHint("1234", "0111");

	}
	
	public String getHint(String secret, String guess) {
        int[] secretPos = new int[10];
        int[] guessPos = new int[10];
        int[] bullPos = new int[10];
        char[] secretChar = secret.toCharArray();
        char[] guessChar = guess.toCharArray();
        int bull = 0, cow = 0;
        for(int i=0; i<secret.length(); i++){
            // look for bull
            if(secretChar[i] == guessChar[i])
                bull++;
            else{
                // look for cow
                secretPos[secretChar[i]-'0']++;
                guessPos[guessChar[i]-'0']++;
            }
        }
        for(int i=0; i<10; i++){
            if(secretPos[i]>0 && guessPos[i]>0)
                cow+=Math.min(secretPos[i], guessPos[i]);
        }
        return bull+"A"+cow+"B";
    }

}
