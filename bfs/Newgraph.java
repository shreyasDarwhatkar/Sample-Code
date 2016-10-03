package bfs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;



public class Newgraph {
	static Map<Node, List<Node>> edges = new HashMap<Node, List<Node>>();
	List<Node> resultLst = new ArrayList<Node>();

	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		Node n7 = new Node(7);
		Node n8 = new Node(8);
		Node n9 = new Node(9);
		Node n10 = new Node(10);

		Node n12 = new Node(12);

		List<Node> a1 = new ArrayList<Node>();
		a1.add(n2);
		a1.add(n4);
		a1.add(n5);

		List<Node> a2 = new ArrayList<Node>();
		a2.add(n8);
		a2.add(n9);

		List<Node> a3 = new ArrayList<Node>();
		a3.add(n9);

		List<Node> a4 = new ArrayList<Node>();
		a4.add(n10);

		List<Node> a5 = new ArrayList<Node>();
		a5.add(n10);

		List<Node> a6 = new ArrayList<Node>();
		a6.add(n1);
		a6.add(n7);

		List<Node> a7 = new ArrayList<Node>();
		a7.add(n1);
		a7.add(n5);

		List<Node> a8 = new ArrayList<Node>();
		a8.add(n3);
		a8.add(n4);

		List<Node> a9 = new ArrayList<Node>();
		a9.add(n6);

		List<Node> a10 = new ArrayList<Node>();
		a10.add(n12);
		a10.add(n7);

		List<Node> a12 = new ArrayList<Node>();
		a12.add(n4);

		edges.put(n1, a1);
		edges.put(n2, a2);
		edges.put(n3, a3);
		edges.put(n4, a4);
		edges.put(n5, a5);
		edges.put(n6, a6);
		edges.put(n7, a7);
		edges.put(n8, a8);
		edges.put(n9, a9);
		edges.put(n10, a10);
		edges.put(n12, a12);
		Newgraph obj=new Newgraph();
		obj.getShortestRoot(n1, n12);

	}

	public void getShortestRoot(Node start, Node end) {
		Map<Node, Node> mapParent=new HashMap<Node, Node>();
		Queue<Node> q = new LinkedList<Node>();
		start.visited = true;
		q.add(start);

		while (!q.isEmpty()) {
			Node node = q.remove();
			
			
			Node child = null;
			node.visited = true;
			while ((child = getUnvisitedNode(node)) != null) {
				mapParent.put(child, node);
				
				if (child.value == end.value) {
					q.clear();
					break;
				}
				q.add(child);
				child.visited=true;
			}

		}

		
			Node parent=end;
			System.out.println(parent.value);
			while(parent.value!=start.value){
					parent=mapParent.get(parent);
					System.out.println(parent.value);
			}
		
		
	}

	public Node getUnvisitedNode(Node n) {

		for (Node child : edges.get(n)) {
			if (!child.visited) {
				return child;
			}
		}

		return null;
	}

}
