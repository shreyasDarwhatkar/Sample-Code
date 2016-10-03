package BinaryTreeLevelTraversal;

public class TreeTraversal {

	public static void main(String[] args) {
	TreeNode root = new TreeNode(1);
	TreeNode root1 = new TreeNode(2);
	TreeNode root2 = new TreeNode(3);
	TreeNode root3 = new TreeNode(4);
	root.left = root1;
	root.right = root2;
	root1.right = root3;
	Solution s = new Solution();
	System.out.println(s.rob(root));
	}

}
