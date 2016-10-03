package avl;

public class AVLTreeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AVLTree avlt = new AVLTree();
		avlt.insert(-10);
		avlt.insert(2);
		avlt.insert(13);
		avlt.insert(-13);
		avlt.insert(-15);
		avlt.insert(15);
		avlt.insert(17);
		avlt.insert(20);
		
		avlt.preorder();

	}

}

