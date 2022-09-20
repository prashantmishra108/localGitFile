package thomasCormen;
class NodeS {
    public int num;
    public NodeS next;
    public NodeS(int n){
        this.num = n;
    }
}
public class SinglyCircularList {
    private  NodeS head = null;
    private  NodeS tail = null;
    private  int size = 0;
    public  int getSize() {
        return size;
    }
    public void insert(int n) {
        NodeS node = new NodeS(n);
        node.next = tail;
        if (tail == null) {
            tail = node;
        } else {
            head.next = node;
        }
        head = node;
        size++;
    }
    public  int delete() {
        if (!isEmpty()) {
            NodeS deq = tail;
            tail = deq.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            head.next = tail;
            return deq.num;
        } else {
            System.out.println("List Empty !!");
        }
        return -1;
    }

    public  boolean isEmpty() {
        return size == 0;
    }

    public void printList() {
        NodeS temp = tail;
        for (int i = 0; i <= size; i++) {
            if (temp != null) {
                System.out.print(temp.num);
                temp = temp.next;
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        SinglyCircularList scl = new SinglyCircularList();
        scl.insert(1);
        scl.insert(2);
        scl.insert(3);
        scl.insert(4);
        scl.insert(5);
        scl.insert(6);
        scl.insert(7);
        scl.printList();
        System.out.println("Del->" + scl.delete());
        scl.insert(8);
        scl.printList();
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        System.out.println("Del->" + scl.delete());
        scl.printList();
        scl.insert(9);
        scl.insert(10);
        scl.printList();
    }
}