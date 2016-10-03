package CodilityBinaryTree;

import java.util.Stack;

import org.w3c.dom.NodeList;


public class BinaryTree {
	
	Node root=null;
	
	public void inOrder( Node cNode)
	{
		if(cNode==null)
			return;
		System.out.println(cNode.value);
		inOrder(cNode.left);
		
		inOrder(cNode.right);
		
	}
	
int count=0;
int max=0;
	public int getVisibleNodes(Node cNode)
	{
		if(max<cNode.value)
		{
			max=cNode.value;
		}
		if(cNode.value>=max)
		{
			count++;
		}
		if(cNode.left!=null && cNode.left.value>max && cNode.left.value>cNode.value)
		{
			count++;
		}
		if(cNode.right!=null && cNode.right.value>max && cNode.right.value>cNode.value)
		{
			count++;
		}
		if(cNode.left!=null && cNode.left.left!=null && !(cNode.left.value>=max))
		{
			getVisibleNodes(cNode.left);
		}
		if(cNode.left!=null && cNode.left.right!=null && !(cNode.right.value>=max))
		{
			getVisibleNodes(cNode.right);
		}
		return count;
	}
	
	 public int solution(Node root)
	    {
	        if (root == null)
	            return 0;
	        int rootValue = root.value;
	        Stack<Node> stack = new Stack<Node>();
	        stack.push(root);
	        int count = 0;
	        while (stack.size() != 0)
	        {
	            Node found = stack.pop();
	            if (found.value >= rootValue)
	                ++count;
	            if (found.left != null)
	                stack.push(found.left);
	            if (found.right != null)
	                stack.push(found.right);
	        }
	        return count;
	    }
	
	 
}
