package triewithmap;

import java.util.HashMap;

public class Node {
	char c;
    HashMap<Character, Node> children = new HashMap<Character, Node>();
    boolean isLeaf;
 
    public Node() {}
 
    public Node(char c){
        this.c = c;
    }
}
