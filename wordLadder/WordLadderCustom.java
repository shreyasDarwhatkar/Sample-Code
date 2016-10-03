package wordLadder;

import java.util.HashSet;
import java.util.Set;

public class WordLadderCustom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WordLadderCustom l = new WordLadderCustom();
		Set<String> wordSet=new HashSet<String>();
		wordSet.add("hot");
		wordSet.add("dot");
		wordSet.add("dog");
		wordSet.add("lot");
		wordSet.add("log");
		System.out.println(l.ladderLength("hit", "cog", wordSet));

	}
	 public int ladderLength(String beginWord, String endWord, Set<String> wordDict) {
		 wordDict.add(endWord);
		int count = 1;
		while(beginWord.equalsIgnoreCase(endWord)){
			for(int i=0 ; i<beginWord.length();i++){
				if(beginWord.equalsIgnoreCase(endWord)){
					return count;
				}
				char[] letters = beginWord.toCharArray();
				char temp = letters[i]; 
				for(char c='a'; c<='z'; c++){
					letters[i] = c;
					String newWord = new String(letters);
					if(!newWord.equalsIgnoreCase(beginWord) && wordDict.contains(newWord)){
						System.out.println(newWord);
						beginWord = newWord;
						count++;
						break;
					}
				}
			}
		}
		 return count; 
	 }

}
