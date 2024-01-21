package linkedlist.utils;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;

public class Util {
    public static LinkedList prepareInput(InputListSize listSize){
        LinkedList returnList = null ;
        int sizeBoundary = getSizeBoundry(listSize);
        for (int i = 0; i < sizeBoundary; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                continue;
            }
            returnList.add(i);
        }
        return returnList;
    }
    public static LinkedList prepareCircularListInput(InputListSize listSize){
        LinkedList returnList = null ;
        Node startingHead = null;
        int sizeBoundary = getSizeBoundry(listSize);
        for (int i = 0; i < sizeBoundary; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                // this node points to null, will be tail
                startingHead = returnList.getHead();
                continue;
            }
            returnList.add(i);
        }
        //set tail.next = head
        startingHead.setNext(returnList.getHead());
        return returnList;
    }

    public static LinkedList prepareZeroOneTwos(InputListSize listSize){
        LinkedList returnList = null ;
        int sizeBoundary = getSizeBoundry(listSize);
        for (int i = 0; i < sizeBoundary/3; i++) {
            if(null == returnList){
                returnList = new LinkedList(i);
                // this node points to null, will be tail
                continue;
            }
            returnList.add(0);
            returnList.add(1);
            returnList.add(2);
        }
        //set tail.next = head
        return returnList;
    }
    private static int getSizeBoundry(InputListSize listSize) {
        int sizeBoundry = 0;
        switch (listSize) {
            case ODD:
                sizeBoundry = 5;
                break;
            case EVEN:
                sizeBoundry = 10;
                break;
//            default: sizeBoundry = 5;
        }
        return sizeBoundry;
    }

    public static void swapNodes(Node head, int n1, int n2) {
        //{4->3->2->1->0->null, size=5} ; swap (4,3)
        // outpuut {head -> 3->4->2->1->0->null}
        Node prevNode1 = null, prevNode2 = null,
        node1 = head, node2 = head;

        // Checks if list is empty
        if (head == null) {
            return;
        }

        // If n1 and n2 are equal, then
        // list will remain the same
        if ((int)n1 == (int)n2)
            return;

        // Search for node1
        while (node1 != null && (int)node1.getValue() != n1) {
            prevNode1 = node1;
            node1 = node1.getNext();
        }

        // Search for node2
        while (node2 != null && (int)node2.getValue() != n2) {
            prevNode2 = node2;
            node2 = node2.getNext();
        }

        if (node1 != null && node2 != null) {

            // If previous node to node1 is not null then,
            // it will point to node2
            if (prevNode1 != null)
                prevNode1.setNext( node2);
            else
                head = node2;

            // If previous node to node2 is not null then,
            // it will point to node1
            if (prevNode2 != null)
                prevNode2.setNext(node1);
            else
                head = node1;

            // Swaps the next nodes of node1 and node2
            Node temp = node1.getNext();
            node1.setNext( node2.getNext());
            node2.setNext(temp);
        }
        else {
            System.out.println("Swapping is not possible");
        }
    }
}
