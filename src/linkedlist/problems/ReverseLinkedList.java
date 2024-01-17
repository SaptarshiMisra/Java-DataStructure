package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.utils.InputListSize;
import linkedlist.utils.Util;

public class ReverseLinkedList {
    private LinkedList reverse(LinkedList inputList){
        if(null != inputList){
            Node head = inputList.getHead();
            Node prev = null; // track a previous
            while(head != null){ // operate on the current node
                Node next = head.getNext();
                if(prev == null)
                    head.setNext(null);
                else head.setNext(prev);// change the next pointer of this node to the prev
                prev = head;
                head = next; // to break the loop, head has to be null. hence later we set updated head to prev, that is the last node.
            }
            inputList.setHead(prev);// update the linked list head after reversing
        }
        return inputList;
    }

    public static void main(String[] args) {
        ReverseLinkedList thisSolution = new ReverseLinkedList();
        LinkedList inputList = Util.prepareInput(InputListSize.ODD);
        System.out.println("input \n"+inputList);
        System.out.println("output \n"+ thisSolution.reverse(inputList));
    }
}
