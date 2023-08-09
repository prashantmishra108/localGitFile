package Algorithms.tree;

public class HasPathSum {
	public static void main(String[] args) {
		
		SubtreeCheck tree = new SubtreeCheck();
		// TREE 1
		/* Construct the following tree
			26
			/ \
			10	 3
		  /	 \	 \
		4	  6   3
		\
		 30 */
		
		tree.root1 = new NodeInt(26);
		tree.root1.right = new NodeInt(3);
		tree.root1.right.right = new NodeInt(3);
		tree.root1.left = new NodeInt(10);
		tree.root1.left.left = new NodeInt(4);
		tree.root1.left.left.right = new NodeInt(30);
		tree.root1.left.right = new NodeInt(6);

		System.out.println(hasPathSum(tree.root1,32));
	}
    /**
     * Definition for binary tree public class TreeNode { int val; TreeNode
     * left; TreeNode right; TreeNode(int x) { val = x; } }
     */
    public static boolean hasPathSum(NodeInt root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null && sum == root.data) {
            return true;
        }

        return hasPathSum(root.left, sum - root.data)
                || hasPathSum(root.right, sum - root.data);
    }
    
    // Solution 2
    public boolean hasPathSum2(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }
        
        if (root.left == null && root.right == null && root.val == sum) {
            return true;
        }
        
        sum -= root.val;
        
        return hasPathSum2(root.left, sum) || hasPathSum2(root.right, sum);
    }
}
