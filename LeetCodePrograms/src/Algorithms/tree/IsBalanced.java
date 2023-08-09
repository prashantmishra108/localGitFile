package Algorithms.tree;

/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class IsBalanced {
    public static void main(String[] strs) {
    //    TreeNode root = new TreeNode(1);
     //   root.left = new TreeNode(2);
       
    	// TREE 1
		/* Construct the following tree
			26
			/ \
		10	 3
	   /	 \	  \
	 4	      6    3
		\
		 30 */
        TreeNode tree = new TreeNode(1);
		tree.root1 = new TreeNode(26);
		tree.root1.right = new TreeNode(3);
		tree.root1.right.right = new TreeNode(3);
		tree.root1.left = new TreeNode(10);
		tree.root1.left.left = new TreeNode(4);
		tree.root1.left.left.right = new TreeNode(30);
		tree.root1.left.right = new TreeNode(6);
	
        System.out.println(isBalanced(tree.root1));
    }
    
    // Solution 1:
    public  boolean isBalanced1(TreeNode root) {
        return dfs(root).isBalanced;
    }
    
    // bug 1: inner class is like:  "public class ReturnType {", no ()
    public class ReturnType {
        boolean isBalanced;
        int depth;
        
       public ReturnType(int depth, boolean isBalanced) {
            this.depth = depth;
            this.isBalanced = isBalanced;
        }
    }
    
    public  ReturnType dfs(TreeNode root) {
        ReturnType ret = new ReturnType(0, true);
        
        if (root == null) {
            return ret;
        }
        
        ReturnType left = dfs(root.left);
        ReturnType right = dfs(root.right);
        
        ret.isBalanced = left.isBalanced 
                         && right.isBalanced 
                         && Math.abs(left.depth - right.depth) <= 1;
                         
        // bug 2: remember to add 1( the root depth )                 
        ret.depth = Math.max(left.depth, right.depth) + 1;
        
        return ret;
    }
	/* Construct the following tree
	26
	/ \
10	 3
/	 \	  \
4	      6    3
\
 30 */
 
    // Solution 2:
    public static boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        boolean cut = false;
        if (root.right == null || root.left == null) {
            cut = true;
        }
        
        return isBalanced(root.left) && isBalanced(root.right)
            && Math.abs(getDepth(root.left, cut) - getDepth(root.right, cut)) <= 1;
    }
    
    public static int getDepth(TreeNode root, boolean cut) {
        if (root == null) {
            return -1;
        }
        
        if (cut && (root.left != null || root.right != null)) {
            // if another tree is not deep, just cut and return fast.
            // Improve the performance.
            return 2;
        }
        
        return 1 + Math.max(getDepth(root.left, false), getDepth(root.right, false));
    }
}