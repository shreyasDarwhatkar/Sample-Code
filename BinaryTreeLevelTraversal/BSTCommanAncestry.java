package BinaryTreeLevelTraversal;

public class BSTCommanAncestry {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		TreeNode root1 = new TreeNode(3);
		TreeNode root2 = new TreeNode(6);
		TreeNode root3 = new TreeNode(2);
		TreeNode root4 = new TreeNode(4);
		TreeNode root5 = new TreeNode(1);
		root.left = root1;
		root.right = root2;
		root1.left = root3;
		root1.right = root4;
		root3.left = root5;
		System.out.println(lowestCommonAncestor(root, root5, root4).val );
	}
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(p == null || q == null){
            return root;
        }
        
        if(p.val < root.val && q.val > root.val){
            return root;
        }
        if(p.val < root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
        }
        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;   
    }

}
