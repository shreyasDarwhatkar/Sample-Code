package CodilityBinaryTree;

public class mainClass {

	public static void main(String[] args) {
		Solution objSolution = new Solution(); 
		BinaryTree objBinaryTree=new BinaryTree();
		Node rootNode=new Node(3);
		objBinaryTree.root=rootNode;
		Node firstleftNode=new Node(9);
		rootNode.left=firstleftNode;
		Node firstRightNode=new Node(20);
		rootNode.right=firstRightNode;
		
		Node secondleftNode=new Node(15);
		Node secondRightNode=new Node(7);
		
		firstRightNode.left = secondleftNode;
		firstRightNode.right = secondRightNode;
		
		
		//objBinaryTree.inOrder(rootNode);
		//System.out.println(objBinaryTree.getVisibleNodes(rootNode));
		System.out.println(objBinaryTree.solution(rootNode));
		
		BinaryTree objBinaryTree2=new BinaryTree();
		Node rootNode1=new Node(8);
		objBinaryTree2.root=rootNode1;
		Node firstleftNode1=new Node(2);
		rootNode1.left=firstleftNode1;
		Node firstRightNode1=new Node(6);
		rootNode1.right=firstRightNode1;
		Node secondleftNode1=new Node(8);
		firstleftNode1.left=secondleftNode1;
		Node secondRightNode1=new Node(2);
		firstleftNode1.right=secondRightNode1;
		//System.out.println(objBinaryTree2.solution(rootNode1));

	}

}
