package triewithmap;

import java.util.HashMap;
import java.util.Map;


public class Trie {
	private Node root;
	 
    public Trie() {
        root = new Node();
    }
    
    public void insert(String word) {
        HashMap<Character, Node> children = root.children;
 
        for(int i=0; i<word.length(); i++){
            char c = word.charAt(i);
 
            Node t;
            if(children.containsKey(c)){
                    t = children.get(c);
            }else{
                t = new Node(c);
                children.put(c, t);
            }
 
            children = t.children;
 
            //set leaf node
            if(i==word.length()-1)
                t.isLeaf = true;    
        }
    }
    
    public boolean search(String word) {
        Node t = searchNode(word);
 
        if(t != null && t.isLeaf) 
            return true;
        else
            return false;
    }
    
    public Node searchNode(String str){
        Map<Character, Node> children = root.children; 
        Node t = null;
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(children.containsKey(c)){
                t = children.get(c);
                children = t.children;
            }else{
                return null;
            }
        }
 
        return t;
    }
    
    public static void main(String[] args) {
    	Trie tree = new Trie();
    	String[] words = {"an", "ant", "all", "allot", "alloy", "aloe", "are", "ate", "be"};
    	
    	 for (int i = 0; i < words.length; i++)
	            tree.insert(words[i]);
    	 String searchWord = "alloy";
    	 
    	 if (tree.search(searchWord))
	        {
	            System.out.println("The word was found");
	        }
	        else
	        {
	            System.out.println("The word was NOT found");
	        }
    }
    
    
	
}
