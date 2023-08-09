package Algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class PostorderTraversal {
   public static void main(String[] args) {
	
	   SubtreeCheck tree = new SubtreeCheck();
		
		// TREE 1
		/* Construct the following tree
			26
			/ \
			10	 3
		  /	 \	 \
		4	  6   3
	   /\
	 15	30 */
		tree.root1 = new NodeInt(26);
		tree.root1.right = new NodeInt(3);
		tree.root1.right.right = new NodeInt(3);
		tree.root1.left = new NodeInt(10);
		tree.root1.left.left = new NodeInt(4);
		tree.root1.left.left.left = new NodeInt(15);
		tree.root1.left.left.right = new NodeInt(30);
		tree.root1.left.right = new NodeInt(6);
		System.out.println(new PostorderTraversal().postorderTraversal1(tree.root1));
   }
	
	public List<Integer> postorderTraversal1(NodeInt root) {
        List<Integer> ret = new ArrayList<Integer>();
        dfs(root, ret);
        return ret;
    }
    
    // Solution 1: rec
    public void dfs(NodeInt root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        
        dfs(root.left, ret);
        dfs(root.right, ret);
        int data = root.data;
        ret.add(root.data);
   /* Construct the following tree
		26
		/ \
	  10   3
	  /	 \	 \
	4	  6   3
   /\
 15	30 */
    }
    
    // Solution 2: iterator
    public List<Integer> postorderTraversal(NodeInt root) {
        List<Integer> ret = new ArrayList<Integer>();
        if (root == null) {
            return ret;
        }
        
        Stack<NodeInt> s = new Stack<NodeInt>();
        Stack<Integer> out = new Stack<Integer>();
        
        s.push(root);
        
        while (!s.isEmpty()) {
        	NodeInt cur = s.pop();
            out.push(cur.data);
            
            if (cur.left != null) {
                s.push(cur.left);
            }
            
            if (cur.right != null) {
                s.push(cur.right);
            }
        }
        
        while (!out.isEmpty()) {
            ret.add(out.pop());
        }
        
        return ret;
    }
}