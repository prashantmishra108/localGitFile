package Algorithms.tree;

//Java program to check if binary tree is subtree of another binary tree

//A binary tree NodeInt
class NodeInt
{
	int data;
	NodeInt left, right, nextRight;

	NodeInt(int item)
	{
		data = item;
		left = right = nextRight = null;
	}
}
public class SubtreeCheck
{
	NodeInt root1,root2;
	TreeNode roott1;

	/* A utility function to check whether trees with roots as root1 and
	root2 are identical or not */
	boolean areIdentical(NodeInt root1, NodeInt root2)
	{

		/* base cases */
		if (root1 == null && root2 == null)
			return true;

		if (root1 == null || root2 == null)
			return false;

		/* Check if the data of both roots is same and data of left and right
		subtrees are also same */
		return (root1.data == root2.data
				&& areIdentical(root1.left, root2.left)
				&& areIdentical(root1.right, root2.right));
	}

	/* This function returns true if S is a subtree of T, otherwise false */
	boolean isSubtree(NodeInt T, NodeInt S)
	{
		/* base cases */
		if (S == null)
			return true;

		if (T == null)
			return false;

		/* Check the tree with root as current NodeInt */
		if (areIdentical(T, S))
			return true;

		/* If the tree with root as current NodeInt doesn't match then
		try left and right subtrees one by one */
		return isSubtree(T.left, S)
				|| isSubtree(T.right, S);
	}

	public static void main(String args[])
	{
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
		
	/*	
		tree.root1 = new TreeNode(26);
		tree.root1.right = new TreeNode(3);
		tree.root1.right.right = new TreeNode(3);
		tree.root1.left = new TreeNode(10);
		tree.root1.left.left = new TreeNode(4);
		tree.root1.left.left.right = new TreeNode(30);
		tree.root1.left.right = new TreeNode(6);
	*/
		tree.root1 = new NodeInt(26);
		tree.root1.right = new NodeInt(3);
		tree.root1.right.right = new NodeInt(3);
		tree.root1.left = new NodeInt(10);
		tree.root1.left.left = new NodeInt(4);
		tree.root1.left.left.right = new NodeInt(30);
		tree.root1.left.right = new NodeInt(6);

		// TREE 2
		/* Construct the following tree
		10
		/ \
		4	 6
		\
		30 */
		
		tree.root2 = new NodeInt(10);
		tree.root2.right = new NodeInt(6);
		tree.root2.left = new NodeInt(4);
		tree.root2.left.right = new NodeInt(30);

		if (tree.isSubtree(tree.root1, tree.root2))
			System.out.println("Tree 2 is subtree of Tree 1 ");
		else
			System.out.println("Tree 2 is not a subtree of Tree 1");
	}
}

//This code has been contributed by Mayank Jaiswal
