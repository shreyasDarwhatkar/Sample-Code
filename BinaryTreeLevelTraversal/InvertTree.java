package BinaryTreeLevelTraversal;

public class InvertTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(5);
		TreeNode t1 = new TreeNode(4);
		TreeNode t2 = new TreeNode(6);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(7);
		TreeNode t6 = new TreeNode(8);
		root.left = t1;
		root.right = t2;
		t1.left = t3;
		t1.right = t4;
		t2.left = t5;
		t2.right = t6;
		
		inOrderTraversal(root);
		inOrderTraversal(invertTreeRoot(root));
	}

	static void inOrderTraversal(TreeNode root){
		if(root == null){
			return ;
		}
		
		inOrderTraversal(root.left);
		System.out.println(root.val);
		inOrderTraversal(root.right);
	}
	
	public static TreeNode invertTreeRoot( TreeNode root){
		if(root == null){
			return null;
		}
		TreeNode left = root.left;
		TreeNode right = root.right; 
		root.left = invertTreeRoot(right);
		root.right = invertTreeRoot(left);
		
		return root;
	}
	
}
