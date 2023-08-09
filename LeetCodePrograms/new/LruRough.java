import java.util.HashMap;
public class LruRough {
	class Listnode{
		int key;
		int val;
		Listnode prev;
		Listnode next;
		public Listnode(int key,int val) {
			this.key=key;
			this.val=val;
			this.prev=null;
			this.next=null;
		}
	}
	HashMap<Integer,Listnode> map ;
	int capacity;
	Listnode head;
	Listnode tail;
	public static void main(String[] args) {
		LruRough cache = new LruRough(5);
		cache.set(1,1);
		
	}
	public LruRough(int capacity) {
		this.capacity=capacity;
		this.map = new HashMap<Integer,Listnode>();
		head=new Listnode(-1,-1);
		tail=new Listnode(-1,-1);
		head.next=tail;
		tail.prev=head;
	}
	 public void set(int key, int value) {
		 Listnode node = map.get(key);
	     if (node == null) {
	    	 node = new Listnode(key, value);
	         // but 2: forget to add the node into the map.
	         map.put(key, node); 
		 }else {
			// set the value.
			   node.val = value; 
			   remove(node);
		 }
		 movetotail(node);
		 if(map.size()>capacity) {
			 map.remove(head.next.key);
			 remove(head.next);
		 }
	 }
	 public void remove(Listnode node) {
		 node.prev.next = node.next;
		 node.next.prev = node.prev;
	 }
	 public void movetotail(Listnode node) {
		 node.prev = tail.prev ;
		 node.next = tail;
		 tail.prev.next = node;
		 tail.prev = node;
	 }
}

