package linkedlist.utils;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;

public class TestUtilFunctions {
    public static void main(String[] args) {
        LinkedList linkedList = Util.prepareInput(InputListSize.ODD);
        System.out.println("Before swap "+ linkedList);
        Node head = linkedList.getHead();
        System.out.println("Head is "+ head.getValue());

        //swap head, head.next
        Util.swapNodes(head,3,0);
        System.out.println("After swap "+ linkedList);
}

}
