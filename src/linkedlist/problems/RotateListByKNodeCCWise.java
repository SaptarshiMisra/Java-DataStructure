package linkedlist.problems;

import linkedlist.datastructure.LinkedList;
import linkedlist.datastructure.Node;
import linkedlist.utils.InputListSize;
import linkedlist.utils.Util;

import java.util.List;

/*
Input: linked list = 10->20->30->40->50->60, k = 4
Output: 50->60->10->20->30->40.
Explanation: k is smaller than the count of nodes in a linked list so (k+1 )th node i.e. 50 becomes the head node and 60’s next points to 10

Input: linked list = 30->40->50->60, k = 2
Output: 50->60->30->40.
 */
public class RotateListByKNodeCCWise {

    private LinkedList rotate(LinkedList input, int k){
        // get the kth node
        int counter =1;
        Node head = input.getHead();
        Node begHead = input.getHead();
        Node newHead = null;
        Node tail = null;
        if(input.size() ==0 || k==0 ){
            return input;
        }
        while ( head.getNext() != null ){// operate on the current node
            if(counter == k){
                tail = head;
                newHead = head.getNext();
            }
            head = head.getNext();
            counter ++;

        }
        if(tail != null){
            tail.setNext(null);
            head.setNext(begHead);
            input.setHead(newHead);
        }
        if(head.getNext() == null && counter == k){//last node

        }
        return input;
    }

    public static void main(String[] args) {
        LinkedList inputList = new LinkedList(10);
//      Input: linked list = 10->20->30->40->50->60, k = 4
        inputList.add(20);
        inputList.add(30);
        inputList.add(40);
        inputList.add(50);
        inputList.add(60);

        System.out.println("Input list "+inputList);
        System.out.println("After middle delete list becomes"+ new RotateListByKNodeCCWise().rotate(inputList,4));
    }

}
