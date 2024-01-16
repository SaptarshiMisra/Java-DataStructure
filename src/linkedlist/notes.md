
#Solid Implementation of LinkedList
````java
public class LinkedList {
    private Node head;
    private int size;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("Size of the linked list: " + linkedList.size());
    }
}
````

The LinkedList class has a private head reference, which points to the first node, and an integer size to keep track of the number of elements in the list.

The add method adds a new node to the end of the linked list.

The size method returns the size of the linked list.

In the main method, an example of creating a linked list and adding elements is provided.

This implementation ensures encapsulation by making the Node class private and using appropriate access modifiers for fields and methods in the LinkedList class.