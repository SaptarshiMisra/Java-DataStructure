package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.datastructure.utils.InputListSize;
import linkedlist.datastructure.utils.Util;

public class DetectLoopInLinkedList {
    // idea is to use 2 pointers. sow and fast.
    // if slow and fast meet ever , then we have a loop.
    // if fast reaches tail of the list having null, then we do not have a loop
    private boolean detectLoop(LinkedList inputList){
        Node slow = inputList.getHead();
        Node fast = inputList.getHead().getNext();

        while( slow != fast){
            if(fast == null || fast.getNext() == null ) return false;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList withLoop = Util.prepareCircularListInput(InputListSize.EVEN);
        System.out.println("Test with a list having loop " + new DetectLoopInLinkedList().detectLoop(withLoop));
        System.out.println("Test with a list not having loop " + new DetectLoopInLinkedList().detectLoop(Util.prepareInput(InputListSize.EVEN)));
    }
}
