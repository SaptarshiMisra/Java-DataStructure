package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.utils.InputListSize;
import linkedlist.utils.Util;

public class MiddleOfLinkedList {
    private Node getMiddleOfLinkedList(LinkedList inputList){
        int i,j =0;
        Node middleNode = null;
        int listSize = inputList.size();
        for(i=0;j<listSize;){
            j += 2;
            i += 1;
        }
        System.out.println("List size "+listSize);
        System.out.println("middle index is "+i);
        middleNode = inputList.get(i);
        return middleNode;
    }
    private Node getMiddleByNodeTraversal(LinkedList inputList){
        Node slow = inputList.getHead();
        Node fast = inputList.getHead().getNext();

        while(fast != null && fast.getNext() != null){
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
    public static void main(String[] args) {
        LinkedList inputList = Util.prepareInput(InputListSize.EVEN);
        System.out.println("input list "+ inputList);
        System.out.println("Middle node is "+ new MiddleOfLinkedList().getMiddleOfLinkedList(inputList).getValue());
        System.out.println("Middle node by node traversal is "+ new MiddleOfLinkedList().getMiddleByNodeTraversal(inputList).getValue());
    }
}
