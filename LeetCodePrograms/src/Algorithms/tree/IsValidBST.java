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
public class IsValidBST {
   
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
		
		tree.root1 = new TreeNode(26);
		tree.root1.right = new TreeNode(35);
		tree.root1.right.right = new TreeNode(45);
		tree.root1.left = new TreeNode(10);
		tree.root1.left.left = new TreeNode(4);
		tree.root1.left.left.right = new TreeNode(8);
		tree.root1.left.right = new TreeNode(16);
		//System.out.println(new IsValidBST().isValidBST(tree.root1));
		System.out.println(new IsValidBST().isBST(tree.root1));
		
	}
	public boolean isValidBST(TreeNode root) {
        return isValidBSTHelp(root).isValidBST;
    }
    
    public ReturnType isValidBSTHelp(TreeNode root) {
        ReturnType ret = new ReturnType(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
        if (root == null) {
            return ret;
        }
		/* Construct the following tree
		26
		/ \
		10	 3
	  /	 \	 \
	4	  6   3
	\
	 30 */
	   
        ReturnType left = isValidBSTHelp(root.left);
        int leftmiax = left.max;
        ReturnType right = isValidBSTHelp(root.right);
        int rightmin = right.min;
        /* the left tree and the right tree should both be Valid BST.
           And the value of the root should be in the middle.
        */
        
        if (!left.isValidBST 
             || !right.isValidBST
             || left.max >= root.val
             || right.min <= root.val
             ) {
            ret.isValidBST = false;
            return ret;
        }
        
        // get the min value of the tree;
        ret.min = Math.min(left.min, root.val);
        
        // get the max value of the tree, consider the right node may be null;
        ret.max = Math.max(right.max, root.val);
        
        return ret;
    }
    
    public class ReturnType {
        int min;
        int max;
        boolean isValidBST;
        
        ReturnType(int min, int max, boolean isValidBST) {
            this.min = min;
            this.max = max;
            this.isValidBST = isValidBST;
        }
    }
    
    
     boolean isBST(TreeNode node)
    {
    	if (node == null)
    		return true;
    	
    	/* False if left is > than node */
    	if (node.left != null && node.left.val > node.val) {
    		int leftval = node.left.val;
    		return false;
    	}
    /*	26
		/ \
		10	 35
	  /	 \	 \
	4	 16   45
	\
	 8 	*/
	   
    	/* False if right is < than node */
    	if (node.right != null && node.right.val < node.val) {
    		int rightval = node.right.val ;
    		return false;
    	}
    	
    	/* False if, recursively, the left or right is not a BST */
    	if (!isBST(node.left) || !isBST(node.right))
    		return false;
    	
    	/* Passing all that, it's a BST */
    	return true;
    }

    // This code is contributed by shubhamsingh10

}