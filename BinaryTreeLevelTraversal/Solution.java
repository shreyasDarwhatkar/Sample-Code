package BinaryTreeLevelTraversal;
import java .util.*; 

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null){
            return result;
        }
        
        List<Integer> lstLevelWise = new ArrayList<Integer>();
        Queue q1 = new LinkedList<TreeNode>();
        Queue q2 = new LinkedList<TreeNode>();
        int oddMoney = 0 ;
        int evenMoney = 0;
        q1.offer(root);
        oddMoney += root.val;
        while(!q1.isEmpty() || !q2.isEmpty()){
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    TreeNode node = (TreeNode)q1.poll();
                    lstLevelWise.add(node.val);
                    if(node.left !=null){
                        q2.offer(node.left);
                        evenMoney += node.left.val;
                        }
                    	
                    if(node.right !=null){
                        q2.offer(node.right);
                        evenMoney += node.right.val;
                        }
                }
            }else if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    TreeNode node = (TreeNode)q2.poll();
                    lstLevelWise.add(node.val);
                    if(node.left !=null){
                        q1.offer(node.left);
                        oddMoney += node.left.val;
                        }
                    if(node.right !=null){
                        q1.offer(node.right);
                        oddMoney += node.right.val;
                        }
                }
            }
            result.add(lstLevelWise);
            lstLevelWise = new ArrayList();
        }
        return result;
    }
	
	 public int customRob(TreeNode root) {
		 if(root == null)
			 return 0;
		 Queue<TreeNode> q1 = new LinkedList<TreeNode>();
		 Queue<TreeNode> q2 = new LinkedList<TreeNode>();
		 int oddSum = 0;
		 int evenSum = 0;
		 q1.add(root);
		 oddSum += root.val;
		 while(!q1.isEmpty() || !q2.isEmpty()){
			 if(!q1.isEmpty()){
				 while(!q1.isEmpty()){
					TreeNode node = q1.poll();
					if(node.left != null){
						q2.offer(node.left);
						evenSum += node.left.val;
					}	
					if(node.right != null){
						q2.offer(node.right);
						evenSum += node.right.val;
					}	
					
				 }
				 
			 }else if(!q2.isEmpty()){
				 while(!q2.isEmpty()){
						TreeNode node = q2.poll();
						if(node.left != null){
							q1.offer(node.left);
							oddSum += node.left.val;
						}	
						if(node.right != null){
							q1.offer(node.right);
							oddSum += node.right.val;
						}	
						
					 }		 
			 }
			 
		 }
		 return(Math.max(oddSum, evenSum)); 
	 }
	 
	 
	 public int rob(TreeNode root) {
		    if(root == null)
		        return 0;
		 
		    int[] result = helper(root);
		    return Math.max(result[0], result[1]);
		}

	    public int[] helper(TreeNode root){
	        if(root == null){
	            int[] result = {0, 0};
	            return result;
	        }
	     
	        int[] result = new int[2];
	        int[] left = helper(root.left);
	        int[] right = helper (root.right);
	     
	        // result[0] is when root is selected, result[1] is when not. 
	        result[0] = root.val + left[1] + right[1];
	        result[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
	     
	        return result;
	    }
}
