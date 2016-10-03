package wordLadder;

import java.util.*;

public class Ladder {

	public static void main(String[] args) {
		Ladder l = new Ladder();
		Set<String> wordSet=new HashSet<String>();
		wordSet.add("hot");
		wordSet.add("dot");
		wordSet.add("dog");
		wordSet.add("lot");
		wordSet.add("log");
		//System.out.println(l.getMinSteps("hit", "cog", wordSet));
		List<List<String>> paths = l.findLadders("hit", "cog", wordSet);
		for(List<String> p : paths){
			System.out.println("List Starts here");
			for(String s : p){
				
				System.out.println(s);
				
			}
			System.out.println("List ends here");
		}
	}

	private int getMinSteps(String startWord, String EndWord, Set<String> dict) {
		Queue<wordNode> q = new LinkedList<wordNode>();
		dict.add(EndWord);
		q.add(new wordNode(startWord, 1));

		while (!q.isEmpty()) {
			wordNode top = q.remove();
			String word = top.word;
			if (word.equalsIgnoreCase(EndWord)) {
				return top.numSteps;
			}
			char[] arr = word.toCharArray();
			for (int i = 0; i < arr.length; i++) {
				for (char c = 'a'; c <= 'z'; c++) {
					char temp=arr[i];
					if (c != arr[i]) {
						arr[i] = c;
					}

					String newWord = new String(arr);
					//System.out.println(newWord);
					if (dict.contains(newWord)) {
						System.out.println(newWord);
						q.add(new wordNode(newWord, top.numSteps + 1));
						dict.remove(newWord);
					}
					arr[i]=temp;
				}
			}
		}

		return 0;
	}
	
	public List<List<String>> findLadders(String start, String end, Set<String> dict) {
        List<List<String>> result = new ArrayList<List<String>>();
 
        LinkedList<WordNodes> queue = new LinkedList<WordNodes>();
        queue.add(new WordNodes(start, 1, null));
 
        dict.add(end);
 
        int minStep = 0;
 
        HashSet<String> visited = new HashSet<String>();  
        HashSet<String> unvisited = new HashSet<String>();  
        unvisited.addAll(dict);
 
        int preNumSteps = 0;
 
        while(!queue.isEmpty()){
            WordNodes top = queue.remove();
            String word = top.word;
            int currNumSteps = top.numSteps;
 
            if(word.equals(end)){
                if(minStep == 0){
                    minStep = top.numSteps;
                }
 
                if(top.numSteps == minStep && minStep !=0){
                    //nothing
                    ArrayList<String> t = new ArrayList<String>();
                    t.add(top.word);
                    while(top.pre !=null){
                        t.add(0, top.pre.word);
                        top = top.pre;
                    }
                    result.add(t);
                    continue;
                }
 
            }
 
            if(preNumSteps < currNumSteps){
                unvisited.removeAll(visited);
            }
 
            preNumSteps = currNumSteps;
 
            char[] arr = word.toCharArray();
            for(int i=0; i<arr.length; i++){
                for(char c='a'; c<='z'; c++){
                    char temp = arr[i];
                    if(arr[i]!=c){
                        arr[i]=c;
                    }
 
                    String newWord = new String(arr);
                    if(unvisited.contains(newWord)){
                        queue.add(new WordNodes(newWord, top.numSteps+1, top));
                        visited.add(newWord);
                    }
 
                    arr[i]=temp;
                }
            }
 
 
        }
 
        return result;
    }

}
