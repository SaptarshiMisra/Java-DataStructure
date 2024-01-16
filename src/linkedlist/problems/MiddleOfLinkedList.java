package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.datastructure.utils.InputListSize;
import linkedlist.datastructure.utils.Util;

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

    public static void main(String[] args) {
        LinkedList inputList = Util.prepareInput(InputListSize.EVEN);
        System.out.println("input list "+ inputList);
        System.out.println("Middle node is "+ new MiddleOfLinkedList().getMiddleOfLinkedList(inputList).getValue());
    }
}
