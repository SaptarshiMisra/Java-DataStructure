package linkedlist.datastructure;

public class Node {
    Object value;
    Node next;

    public Node(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return  value +
                "-> " + next;
    }
}
