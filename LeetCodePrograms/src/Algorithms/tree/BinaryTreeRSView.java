package Algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRSView {
	public static void main(String[] args) {
		TreeNode199 root = new TreeNode199(1);
		root.left= new TreeNode199(2);
		root.left.right= new TreeNode199(7);
		root.right= new TreeNode199(3);
		root.right.left= new TreeNode199(4);
		root.right.right= new TreeNode199(5);
		List<Integer> rightsideList = new BinaryTreeRSView().rightSideView(root);
		System.out.println(rightsideList);

	}
	/*
	 * 					  1
	 * 					 / \
	 * 					2	3
	 * 					\	/\	
	 * 					7  4   5
	 */
	public List<Integer> rightSideView(TreeNode199 root){
		List<Integer> result = new ArrayList<Integer>();
		Queue<TreeNode199> queue = new LinkedList<TreeNode199>();
		if(root==null) return result;
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size=queue.size();
			for(int i=0;i<size;i++) {
				TreeNode199 currentNode = queue.poll();
				if(i==0)result.add(currentNode.val);
				if(currentNode.right!=null)queue.offer(currentNode.right);
				if(currentNode.left!=null)queue.offer(currentNode.left);
			}
		}
		return result;
	}
}

class TreeNode199{
	int val;
	TreeNode199 left;
	TreeNode199 right;
	TreeNode199(int x) {val=x;}
}
