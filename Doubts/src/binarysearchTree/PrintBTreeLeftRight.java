package binarysearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Java program to print left view of binary tree
/* Class containing left and right child of current
node and key value*/
class Node1 {
	int data;
	Node1 left, right;
	List<Node1> ImmediateChildren = new ArrayList();

	public Node1(int item) {
		data = item;
		left = right = null;
	}

	List<Node1> getImmediates(Node1 node) {
		List<Node1> listNode = new ArrayList();
		listNode.add(node.left);
		listNode.add(node.right);
		return listNode;
	}
}

/* Class to print the left view */
public class PrintBTreeLeftRight {
	Node1 root;
	int i = 0;
	static int max_level = 0;
	static int matrix[][] = new int[6][6];

// recursive function to print left view
	void leftViewUtil(Node1 node, int level) {
		int a = i, data;
		// Base Case
		if (node == null) {
			i = 0;
			return;
		}
		a = i;
		//data = node.data;
		// If this is the first node of its level
		matrix[level][i] = node.data;
		i = ++i;
		// Recur for left and right subtrees
		leftViewUtil(node.left, level + 1);
		leftViewUtil(node.right, level + 1);
	}

// A wrapper over leftViewUtil()
	void leftView() {
		leftViewUtil(root, 1);
	}

	/* testing for example nodes */
	public static void main(String args[]) { /* creating a binary tree and entering the nodes */
		PrintBTreeLeftRight tree = new PrintBTreeLeftRight();
		tree.root = new Node1(12);
		tree.root.left = new Node1(10);
		tree.root.right = new Node1(30);
		tree.root.right.left = new Node1(25);
		tree.root.right.right = new Node1(40);
		tree.leftView();
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (matrix[i][j] != 0)
					//System.out.print(matrix[i][j] + " ");
				System.out.print("");
			}
		}
		
		//find leftmost value in the last row of the tree.
		List<Node1> q = new LinkedList();
		Node1 root = new Node1(0);
		q.add(tree.root);
		while(!q.isEmpty()) {
			root=q.remove(0);
			if(root.right!=null)
				q.add(root.right);
			

			if(root.left!=null)
				q.add(root.left);
		}
		
		System.out.println(root.data);
	
	}
}
