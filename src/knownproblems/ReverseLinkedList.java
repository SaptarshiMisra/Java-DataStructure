package leetcode.medium;

import linkedlist.LinkedList;
import linkedlist.Node;

public class ReverseLinkedList {
    private LinkedList prepareInput(){
        LinkedList returnList = null ;
        for (int i = 0; i < 5; i++) {
             if(null == returnList){
                 returnList = new LinkedList(i);
                 continue;
             }
             returnList.add(i);
        }
        return returnList;
    }
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
                if(null != head) head = next; // check for null before updating else final value of head which is null, will be set to head.

            }
            inputList.setHead(head);// update the linked list head after reversing
        }
        return inputList;
    }

    public static void main(String[] args) {
        ReverseLinkedList thisSolution = new ReverseLinkedList();
        System.out.println(thisSolution.reverse(thisSolution.prepareInput()));
    }
}
