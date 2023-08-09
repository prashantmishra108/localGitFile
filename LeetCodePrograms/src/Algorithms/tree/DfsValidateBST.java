package Algorithms.tree;

import java.util.Stack;

public class DfsValidateBST {
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);			
		// TREE 1
		/* Construct the following tree
			26
			/ \
		10	 35
	  /	  \	  \
	4	   16   45
	\
	   8 */
		
/*		tree.root1 = new TreeNode(26);
		tree.root1.right = new TreeNode(35);
		tree.root1.right.right = new TreeNode(45);
		tree.root1.left = new TreeNode(10);
		tree.root1.left.left = new TreeNode(4);
		tree.root1.left.left.right = new TreeNode(8);
		tree.root1.left.right = new TreeNode(16);
	*/	//System.out.println(new IsValidBST().isValidBST(tree.root1));
	//	System.out.println( IsValidBST(tree.root1));
		
		tree.root1 = new TreeNode(25);
		//tree.root1.left = new TreeNode(15);
		tree.root1.right = new TreeNode(35);
		tree.root1.right.right = new TreeNode(45);
		//tree.root1.right.right.right = new TreeNode(55);
		//tree.root1.right.right.right.right = new TreeNode(65);
		//tree.root1.left=new TreeNode(15);
		System.out.println(IsBalancedTree(tree.root1));
		
	}
	//dfs 
	public static boolean IsValidBST(TreeNode root  ) {
		//use stack,
		Stack<TreeNode> s = new Stack();
		double left_child_val = Double.MIN_VALUE;
		while(!s.isEmpty() || root!=null) {
			while(root!=null) {
				s.push(root);
				root=root.left;
			}
			root = s.pop();
			if (root.val<=left_child_val) return false;
			left_child_val = root.val;
			root=root.right;
		}
		return true;
	}
	
	public static boolean IsBalancedTree(TreeNode root ) {
		int val= root!=null?root.val:0;
		if(root==null)return true;
		int hl=height(root.left);
		int hr=height(root.right);
		return Math.abs(hl - hr)<2;
		
	}
	
	public static int height(TreeNode root) {
		int val=root!=null?root.val:0;
		if(root==null)return -1;
		int hl=height(root.left);
		int hr=height(root.right);
		int height = Math.max(hl, hr)+1;
		return height;
	}
}
