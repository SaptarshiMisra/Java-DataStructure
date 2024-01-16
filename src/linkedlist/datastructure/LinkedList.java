package linkedlist.datastructure;

public class LinkedList {
    private Node head;
    private int size;

    public LinkedList(Object data) {
        this.head = new Node(data);
        this.size = 1;
    }

    public void add(Object data) {
        Node newNode = new Node(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "LinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }

    public Node get(int index) {
        Node getNode = null;
        for (int i = 0; i < index; i++) {
            if(null == getNode) getNode = head.getNext();
            else getNode = getNode.getNext();
        }
        return getNode;
    }
}

