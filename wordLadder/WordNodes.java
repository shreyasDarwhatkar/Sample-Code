package wordLadder;

public class WordNodes {
	String word;
    int numSteps;
    WordNodes pre;
 
    public WordNodes(String word, int numSteps, WordNodes pre){
        this.word = word;
        this.numSteps = numSteps;
        this.pre = pre;
    }

}
