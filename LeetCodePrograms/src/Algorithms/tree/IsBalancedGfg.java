package Algorithms.tree;
//revisit agains https://www.geeksforgeeks.org/how-to-determine-if-a-binary-tree-is-balanced/
import com.sun.source.tree.BinaryTree;
/* Java program to determine if binary tree is
	height balanced or not */
	/* A binary tree node has data, pointer to left child,
	and a pointer to right child */
	public class IsBalancedGfg {
	Node root;
		/* Returns true if binary tree with root as root is height-balanced */
		boolean isBalanced(TreeNode node)
		{
			int lh; /* for height of left subtree */
			int rh; /* for height of right subtree */
			/* If tree is empty then return true */
			if (node == null)
				return true;
			/* Get the height of left and right sub trees */
			lh = height(node.left);
			rh = height(node.right);
			if (Math.abs(lh - rh) <= 1
				&& isBalanced(node.left)
				&& isBalanced(node.right))
				return true;
			/* If we reach here then tree is not height-balanced */
			return false;
		}
		/* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION */
		/* The function Compute the "height" of a tree. Height is the
			number of nodes along the longest path from the root node
			down to the farthest leaf node.*/
		static int height(TreeNode left)
		{
			/* base case tree is empty */
			if (left == null)
				return 0;
			/* If tree is not empty then height = 1 + max of left
			height and right heights */
			return 1 + Math.max(height(left.left), height(left.right));
		}

		public static void main(String args[])
		{
			TreeNode tree = new TreeNode(1);			
			// TREE 1
			/* Construct the following tree
				26
				/ \
				10	 3
			  /	 \	 \
			4	  6   3
			\
			 30 */
			
			tree.root1 = new TreeNode(26);
			tree.root1.right = new TreeNode(3);
			tree.root1.right.right = new TreeNode(3);
			tree.root1.left = new TreeNode(10);
			tree.root1.left.left = new TreeNode(4);
			tree.root1.left.left.right = new TreeNode(30);
			tree.root1.left.right = new TreeNode(6);
			if (new IsBalancedGfg().isBalanced(tree.root1))
				System.out.println("Tree is balanced");
			else
				System.out.println("Tree is not balanced");
		}
	}

	// This code has been contributed by Mayank Jaiswal(mayank_24)
