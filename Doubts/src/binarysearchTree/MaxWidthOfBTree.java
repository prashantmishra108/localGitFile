package binarysearchTree;

import java.util.HashMap;

public class MaxWidthOfBTree {

	//leetcode max width of b tree
	int max_width;
	HashMap<Integer,Integer>leftmost_positions;
	public int widthOfBTree(Node1 root) {
		max_width=0;
		leftmost_positions = new HashMap<>();
		getWidth(root,0,0);
		return max_width;
	}
	private void getWidth(Node1 root, int depth, int position) {
		// TODO Auto-generated method stub
		if(root==null)return;
		leftmost_positions.putIfAbsent(depth,position);
		int val = root.data;
		max_width=Math.max(max_width, position-leftmost_positions.get(depth)+1);
		getWidth(root.left, depth+1, position*2);
		getWidth(root.right, depth+1, position*2+1);
	
	}
	public static void main(String args[]) { /* creating a binary tree and entering the nodes */
		PrintBTreeLeftRight tree = new PrintBTreeLeftRight();
		tree.root = new Node1(12);
		tree.root.left = new Node1(10);
		tree.root.right = new Node1(30);
		/*
		 * tree.root.left.left = new Node1(5); tree.root.left.right = new Node1(8);
		 */tree.root.right.left = new Node1(15);
		tree.root.right.right = new Node1(35);
		//tree.root.right.left = new Node1(25);
		//tree.root.right.right = new Node1(40);
		try {
			int i = new MaxWidthOfBTree().widthOfBTree(tree.root);
			System.out.println("max width="+i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
}
