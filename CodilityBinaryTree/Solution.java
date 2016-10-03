package CodilityBinaryTree;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList();
        if(root == null){
            return result;
        }
        
        List<Integer> lstLevelWise = new ArrayList<Integer>();
        Queue q1 = new LinkedList<TreeNode>();
        Queue q2 = new LinkedList<TreeNode>();
        q1.add(root);
        while(!q1.isEmpty() || !q2.isEmpty()){
            if(!q1.isEmpty()){
                while(!q1.isEmpty()){
                    TreeNode node = (TreeNode)q1.poll();
                    lstLevelWise.add(node.val);
                    if(node.left !=null)
                        q2.offer(node.left);
                    if(node.right !=null)
                        q2.offer(node.right);
                }
            }else if(!q2.isEmpty()){
                while(!q2.isEmpty()){
                    TreeNode node = (TreeNode)q2.poll();
                    lstLevelWise.add(node.val);
                    if(node.left !=null)
                        q1.offer(node.left);
                    if(node.right !=null)
                        q1.offer(node.right);
                }
            }
            result.add(lstLevelWise);
            lstLevelWise.clear();
        }
        return result;
    }

}
