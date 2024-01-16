package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.datastructure.utils.InputListSize;
import linkedlist.datastructure.utils.Util;

public class DeleteMiddleOfList {
    private LinkedList deleteMiddle(LinkedList inputList){
        Node slow = inputList.getHead();
        Node fast = inputList.getHead().getNext();
        Node beforeMiddle = null;
        while(fast != null && fast.getNext() != null){
            beforeMiddle = slow;
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        Node middleNode = slow;
        System.out.println("Before Middle node "+beforeMiddle.getValue());
        System.out.println("Middle node "+slow.getValue());
        System.out.println("After Middle node "+slow.getNext().getValue());
        beforeMiddle.setNext(slow.getNext());
        inputList.setSize(inputList.size() - 1);
        return inputList;
    }

    public static void main(String[] args) {
        LinkedList inputList = Util.prepareInput(InputListSize.EVEN);
        System.out.println("Input list "+inputList);
        System.out.println("After middle delete list becomes"+new DeleteMiddleOfList().deleteMiddle(inputList));
    }
}
