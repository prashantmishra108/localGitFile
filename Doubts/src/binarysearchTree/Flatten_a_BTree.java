package binarysearchTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Flatten_a_BTree {
	static NodeFlatten root;
	public static void main(String args[]) {
		
		root = new NodeFlatten(12);
		root.left = new NodeFlatten(10);
		root.right = new NodeFlatten(30);
		root.right.left = new NodeFlatten(25);
		root.right.right = new NodeFlatten(40);
	
		new Flatten_a_BTree().flatten(root);	
	}

	
	public void flatten(NodeFlatten node) {
		
		
		if(node==null)return;
		Stack<NodeFlatten> st = new Stack<>();
		NodeFlatten head = node;
		NodeFlatten temp = node;
		st.push(node);
		while(!st.isEmpty()) {
			NodeFlatten currNode = st.pop();
			
			if(currNode.right!=null)
				st.push(currNode.right);
			if(currNode.left!=null)
				st.push(currNode.left);
			if(!st.isEmpty()) {
				NodeFlatten newNode = st.peek();
				temp.right=newNode;
				temp.left=null;
				temp=newNode;
			}	
			
		}
		System.out.println(head);
	}
}


class NodeFlatten {
	int data;
	NodeFlatten left, right;
	List<NodeFlatten> ImmediateChildren = new ArrayList();

	public NodeFlatten(int item) {
		data = item;
		left = right = null;
	}

	List<NodeFlatten> getImmediates(NodeFlatten node) {
		List<NodeFlatten> listNode = new ArrayList();
		listNode.add(node.left);
		listNode.add(node.right);
		return listNode;
	}
}
