package Algorithms.tree;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
//LeetCode N-ary Tree Preorder Traversal Solution Explained  - Java
public class naryTree {
 public static List<Integer> preorder(NodeNary root) {
    LinkedList<NodeNary>stack = new LinkedList<NodeNary>(); 
    LinkedList<Integer> output_arr = new  LinkedList<Integer>();
   if(root==null){
       return output_arr;
   }  
     
     stack.add(root);
     while(!stack.isEmpty()){
         NodeNary NodeNary = stack.pollLast();
         output_arr.add(NodeNary.val);
         Collections.reverse(NodeNary.children);
         for(NodeNary child:NodeNary.children){
             stack.add(child);
         }
     }
     return output_arr;
 }
 
 public static void main(String[] args) {
	NodeNary root = new NodeNary(1);
	root.children.add(new NodeNary(3));
	root.children.add(new NodeNary(2));
	root.children.add(new NodeNary(4));
	root.children.get(0).children.add(new NodeNary(5));
	root.children.get(0).children.add(new NodeNary(6));
	LinkedList<Integer> out = (LinkedList<Integer>) preorder(root);
	System.out.println(out);
}


//Definition for a NodeNary.


}
class NodeNary {
	public int val;
	public List<NodeNary> children = new LinkedList<NodeNary>();

	public NodeNary() {
	}

	public NodeNary(int _val) {
		val = _val;
	}

	public NodeNary(int _val, List<NodeNary> _children) {
		val = _val;
		children = _children;
	}
}