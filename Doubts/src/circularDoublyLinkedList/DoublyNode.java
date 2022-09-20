package circularDoublyLinkedList;

public class DoublyNode<NodeType>
implements Comparable<NodeType> {

private DoublyNode<NodeType> prev;
private NodeType info;
private DoublyNode<NodeType> next;

public DoublyNode(NodeType info) {
   super();
   this.info = info;
   this.next = null;
   this.prev = null;
}

public DoublyNode<NodeType> getPrev() {
   return prev;
}

public void setPrev(DoublyNode<NodeType> prev) {
   this.prev = prev;
}

public NodeType getInfo() {
   return info;
}

public void setInfo(NodeType info) {
   this.info = info;
}

public DoublyNode<NodeType> getNext() {
   return next;
}

public void setNext(DoublyNode<NodeType> next) {
   this.next = next;
}

@Override
public int compareTo(NodeType o) {
   return 0;
}

}